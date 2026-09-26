values <- c(1, NA_real_, 3)
cat(is.na(values), "\n")
cat(mean(values, na.rm = TRUE), "\n")
cat(length(NULL), is.na(NaN), is.nan(NA_real_), "\n")
