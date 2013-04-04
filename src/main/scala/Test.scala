import java.{util => ju}

object Test {
  def exampleGenericMethod[T](list: ju.List[T]): ju.Set[T] = new ju.HashSet[T](list)
}
