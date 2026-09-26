package study

import "testing"

func TestSum(t *testing.T) {
    cases := []struct {
        name string
        input []int
        want int
    }{
        {"empty", nil, 0},
        {"positive", []int{1, 2, 3}, 6},
        {"mixed", []int{-2, 2}, 0},
    }
    for _, tc := range cases {
        t.Run(tc.name, func(t *testing.T) {
            if got := Sum(tc.input); got != tc.want {
                t.Fatalf("Sum(%v) = %d, want %d", tc.input, got, tc.want)
            }
        })
    }
}
