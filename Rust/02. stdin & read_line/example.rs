use std::io;
fn main() -> Result<(), Box<dyn std::error::Error>> {
    let mut input = String::new();
    if io::stdin().read_line(&mut input)? == 0 {
        return Err("no input".into());
    }
    let value: i32 = input.trim().parse()?;
    println!("value={value}");
    Ok(())
}
