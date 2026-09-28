package main

import (
	"net/http/httptest"
	"strings"
	"testing"
)

func TestRoutes(t *testing.T) {
	router := NewRouter()
	cases := []struct {
		method, path, body string
		status             int
		text               string
	}{
		{"GET", "/", "", 504, "timeout"},
	}
	for _, tc := range cases {
		request := httptest.NewRequest(tc.method, tc.path, strings.NewReader(tc.body))
		if tc.body != "" {
			request.Header.Set("Content-Type", "application/json")
		}
		response := httptest.NewRecorder()
		router.ServeHTTP(response, request)
		if response.Code != tc.status {
			t.Fatalf("%s %s: got %d want %d", tc.method, tc.path, response.Code, tc.status)
		}
		if tc.text != "" && !strings.Contains(response.Body.String(), tc.text) {
			t.Fatalf("unexpected body: %s", response.Body.String())
		}
	}
}
