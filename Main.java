import org.junit.Before;

class Main {
  public static void main(String[] args) {

  ComboLockTest a = new ComboLockTest();
  a.testPasswordConstructor();
  a.testNumberConstructor();
  a.testNumberAndPasswordConstructor();

     
  ComboLockRun t = new ComboLockRun();
  t.run(args);
    
  }
}