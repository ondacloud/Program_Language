struct Rectangle { width: u32, height: u32 }
impl Rectangle {
    fn new(width: u32, height: u32) -> Self { Self { width, height } }
    fn area(&self) -> u32 { self.width * self.height }
}
fn main() {
    let rect = Rectangle::new(3, 4);
    println!("{}", rect.area());
}
