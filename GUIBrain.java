import java.util.Locale;

/** This class contains the intellect the GUI class needs to provide 
    services to the Control class. It also hides the GUI and Control from
    each other, serving as the middle-man for all their communication. */
public class GUIBrain {
    /** This field contains the languages available, with the long,
	English names like "Finnish" or "English (GB)" as keys and 
	the locales corresponding to the languages as values. */
    private HashTable availableLanguages;
    
    private Settings currentSettings;
    /** This field is set when menuInterrupt is called, and all continuous
	loops which do many things and wait for input in between should 
v	check if this is sent before continuing to their next step. An 
	interrupt sent means they should stop doing whatever they were doing
	as soon as is reasonable. (Usually when it would be the time to 
	wait for input from the user. */
    private boolean interruptSent;

    /** This constructor sets up the GUIBrain instance. It calls private
	initialization functions, including findAvailableLanguages(). */
    public GUIBrain() { }

    /** This method corresponds to the menu option File -> Open... It 
	calls either openBinaryFile or openSourceFile correspondingly. */
    public void menuOpenFile(String filepath) { }

    /** This method corresponds to the menu option File -> Run. It does 
	its work by calling runInstruction(). */
    public void menuRun() { }

    /** This method corresponds to the menu option File -> Compile. It
	does its work by calling compileLine(). */
    public void menuCompile() { }

    /** This method corresponds to the menu option File -> Erase memory. */
    public void eraseMemory() { }

    /** This method corresponds to the menu option File -> Exit. */
    public void menuExit() { }

    /** This method corresponds to a request to interrupt whatever we 
	were doing once it becomes possible. */
    public void menuInterrupt() { }

    public void menuSetLanguage(String language) 
    public void menuSetStdIn(String filepath) {}

    public void menuSetStdOut(String filepath) {}
    
    public void menuSetMemorySize(int newSize) {}

    public void menuSetRunningOptions(/* parameters not decided */) {}

    public void menuAbout() {}
    
    public void menuManual() {}

    /** This method corresponds to some user input saying that a long,
	commented task can continue. */
    public void continueTask() {}

    /* In addition: Some EventListeners which would eg. call continueTask
       instead of GUI trying to determine which means that we should go on? */

    // Services for Control. ----------------------------------------------

    public String getUserKeyboardInput() {}

    // Private methods. ---------------------------------------------------
    
    /** This method determines the available languages. It reads them from 
	a setup file languages.cfg, which contains lineseparator-delimited
	sets of language-name, language-id, (country), eg.
	"Finnish, fi", or "English (GB), en, GB". */
    private void findAvailableLanguages() { }

    /** This method calls the Control class service for running one 
	instruction and deals with the possible animation according to the 
	returned RunInfos. */
    private void runInstruction() { }

    /** This method calls the Control class service for compiling a line
	and deals with the possible animation according to the returned
	CompileInfos. */
    private void compileLine() { }

    private void openBinaryFile(String filePath) {}

    private void openSourceFile(String filePath) {}
}