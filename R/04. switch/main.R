command <- "save"
result <- switch(command,
  open = "opened",
  save = "saved",
  "unknown"
)
cat(result, "\n")
