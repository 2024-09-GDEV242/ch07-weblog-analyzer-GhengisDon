import java.io.File;
import java.io.FileReader;

/**
 * Read web server data and analyse hourly access patterns.
 * 
 * @author Don Santiago
 * @version    2024.11.5
 * 
 * major changes so far include the import of java.io.File;
 * major changes so far include the import of java.io.FileReader;
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader("demo.log");
    }
    
    
    /**
     * test code area for 7.12
     */
    File file = new File("C:\\Users\\g00301287\\Documents\\GitHub\\ch07-weblog-analyzer-GhengisDon\\Tester");
 
    
    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * 7.14 this should be numberOfAccesses
     */
    public void printNumberofAccesses()
    {
    
    }
    
    /**
     * 7.15 this should be busiestHour
     */
    public void busiestHour()
    {
        System.out.println("The busiest hour of the day was the ");
        
    }
    
    /**
     * 7.16 this should be quiestestHour
     */
    public void quiestiestHour()
    {
        System.out.println("The quiestest hour of the day was the ");
    }
    
    /**
     * 7.18 this is busiestTwoHour
     */
    public void quiestHour()
    {
        //System.out.println("The busiest hours of the day were between ") x & y (".");
    }
    
    /**
     * 7.19 This should have a variety of methods that will be called up and looked at
     * additionally this should show us the questestDay in the entire collection
     * additionally this should show us the busiestDay of the entire collection
     * additionally this should show the full totalAccessPerMonth in the entire collection
     * additionally we will create a new logfile stemming from January 1st, 2015 to December 31st, 2019 and call new methods
     * of these additional methods we will have to produce an output that gives us the quietestMonth in that time frame
     * of these additional methods we will have to produce an output that gives us the busiestMonth in that time frame
     * of these additional methods we will have to produce an output that gives us the averageAccessesPerMonth in that time frame
     */
    



    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
}
