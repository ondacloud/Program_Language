add <- function(a, b) a + b
stopifnot(add(2, 3) == 5, add(-1, 1) == 0)
stopifnot(isTRUE(all.equal(0.1 + 0.2, 0.3)))
cat("checks passed\n")
