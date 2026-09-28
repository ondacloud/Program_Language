mixin Labelled {
  String label(String message) => '[course] $message';
}

class Worker with Labelled {}

void main() {
  final worker = Worker();
  print(worker.label('ready'));
}
