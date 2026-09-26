person <- list(name = "Kim", scores = c(80, 90))
cat(person$name, mean(person[["scores"]]), "\n")
cat(is.list(person["name"]), is.character(person[["name"]]), "\n")
