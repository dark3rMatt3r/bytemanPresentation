package org.my;

class MyClass
{
  boolean flip = true;
  boolean myMethod(int value)
  {
    flip = !flip;
    boolean result;
    if (flip) {
        result = myOddMethod(2 * value);
    } else {
        result = myOddMethod(2 * value + 1);
    }
    return result;
  }

  boolean myOddMethod(int oddOrEven)
  {
      return ((oddOrEven & 1) == 1);
  }
}
