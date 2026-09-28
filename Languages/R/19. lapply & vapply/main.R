values <- list(1:3, 4:5)
result <- lapply(values, sum)
cat(unlist(result), "\n")
cat(vapply(values, length, integer(1)), "\n")
