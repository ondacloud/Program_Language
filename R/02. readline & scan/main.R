if (interactive()) {
  name <- readline("Name: ")
} else {
  name <- scan("input.txt", what = character(), nmax = 1, quiet = TRUE)
}
if (length(name) != 1L || !nzchar(name)) stop("name required")
cat("Hello", name, "\n")
values <- scan(text = "10 20 30", quiet = TRUE)
cat(sum(values), "\n")
