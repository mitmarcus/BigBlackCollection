package model;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year)
  {
    set(day, month, year);
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public int daysBetween(MyDate other) //ricardo pls change on class diagram to myDate other from MyDate myDate - filip
  {
    int days = 0;

      days = other.day - this.day; //shouldn't this be in the if statement? i just copied how stephan made the method and changed it a bit idk - filip
      if (this.day > other.day)
      {
        days--;
      }

    else
    {
      days = this.day - other.day;
      if (other.day > this.day)
      {
        days--;
      }
    }
    return days;
  }

  public MyDate copy()
  {
    MyDate other = new MyDate(day, month, year);

    return other;
  }

//  public String toString()
//  {
//
//  }
}
