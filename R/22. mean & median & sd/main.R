x <- c(1, 2, 3, 4, 10)
cat(mean(x), median(x), min(x), max(x), "\n")
cat(round(sd(x), 3), "\n")
cat(quantile(x, probs = c(0.25, 0.75), names = FALSE), "\n")
