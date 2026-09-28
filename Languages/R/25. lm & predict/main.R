data <- data.frame(x = 1:4, y = c(3, 5, 7, 9))
fit <- lm(y ~ x, data = data)
cat(round(unname(coef(fit)), 6), "\n")
cat(round(unname(predict(fit, newdata = data.frame(x = 5))), 6), "\n")
