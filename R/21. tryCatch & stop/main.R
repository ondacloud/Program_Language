positive <- function(x) {
  if (length(x) != 1L || is.na(x) || x <= 0) stop("positive required")
  x * 2
}
result <- tryCatch(positive(-1), error = function(e) conditionMessage(e))
cat(result, "\n")
cat(positive(3), "\n")
