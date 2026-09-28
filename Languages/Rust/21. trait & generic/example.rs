trait Describe { fn describe(&self) -> String; }
struct User { name: String }
impl Describe for User { fn describe(&self) -> String { format!("user:{}", self.name) } }
fn show<T: Describe>(value: &T) { println!("{}", value.describe()); }
fn main() { show(&User { name: "Kim".into() }); }
