fn double(text: &str) -> Result<i32, std::num::ParseIntError> {
    let n: i32 = text.parse()?;
    Ok(n * 2)
}
fn main() {
    for text in ["12", "bad"] {
        match double(text) { Ok(n) => println!("{n}"), Err(_) => println!("invalid integer") }
    }
}
