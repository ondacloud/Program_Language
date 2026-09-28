mod math {
    fn twice(n: i32) -> i32 { n * 2 }
    pub fn score(n: i32) -> i32 { twice(n) + 1 }
}
use crate::math::score;
fn main() { println!("{}", score(3)); }
