There's one edge condition that you need to take into account
If you try to `pop` an item from the `Stack` when it is empty,
you'll get an `EmptyStackException`. Try looking at the methods
in the [Stack class Javadoc](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)
to see if there's a way to avoid having to deal with this exception.
