async fn answer() -> u32 { 42 }
fn main() {
    let future = answer();
    drop(future);
    println!("future created, not executed");
}
