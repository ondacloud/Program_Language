const LIMIT: usize = 3;
fn main() {
    let values: [i32; LIMIT] = [10, 20, 30];
    let pair = ("Kim", 20);
    let (name, age) = pair;
    println!("{} {name} {age}", values[1]);
    println!("{}", values.get(3).is_none());
    let x = 1;
    { let x = 2; println!("{x}"); }
    println!("{x}");
}
