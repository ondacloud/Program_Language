people <- data.frame(name = c("Kim", "Lee"), age = c(20, 30), stringsAsFactors = FALSE)
cat(people$name, "\n")
cat(people[people$age >= 25, "name"], "\n")
cat(nrow(people), ncol(people), "\n")
