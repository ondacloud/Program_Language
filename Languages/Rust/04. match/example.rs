fn main() {
let command = "save";
match command {
    "save" | "write" => println!("saved"),
    "open" => println!("opened"),
    _ => println!("unknown"),
}
}
