use std::{sync::mpsc, thread};
fn main() {
    let (tx, rx) = mpsc::channel();
    let handle = thread::spawn(move || { tx.send(String::from("done")).expect("receiver exists"); });
    println!("{}", rx.recv().expect("sender exists"));
    handle.join().expect("worker finished");
}
