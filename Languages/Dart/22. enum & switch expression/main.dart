enum Status { ready, busy }

void main() {
  final state = Status.ready;
  print(switch (state) { Status.ready => 'go', Status.busy => 'wait' });
}
