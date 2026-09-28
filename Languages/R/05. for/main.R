values <- c(10, 20, 30)
total <- 0
for (i in seq_along(values)) total <- total + values[i]
cat(total, "\n")
