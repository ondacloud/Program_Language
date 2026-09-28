use std::{cell::RefCell, rc::Rc};
fn main() {
    let value = Rc::new(RefCell::new(1));
    let other = Rc::clone(&value);
    *other.borrow_mut() += 1;
    println!("{} {}", value.borrow(), Rc::strong_count(&value));
    let boxed = Box::new(3);
    println!("{}", *boxed);
}
