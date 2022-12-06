package model;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
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


  /* This shoudnt work?
  public int daysBetween(Date other) //ricardo pls change on class diagram to myDate other from Date myDate - filip
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
  }*/

  public Date copy()
  {
    Date other = new Date(day, month, year);
    return other;
  }

  public String toString()
  {
    String str = "";

    if (day < 10)
      str += "0" + day + "/";
    else
      str += day + "/";

    if (month < 10)
      str += "0" + month + "/";
    else
      str += month + "/";

    str += year + " ";

    return str;
  }
}
