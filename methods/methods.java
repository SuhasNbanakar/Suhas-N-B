class	Static Methods @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

static String	copyValueOf(char[] data)

static String	copyValueOf(char[] data, int offset, int count)

static String	format(Locale l, String format, Object... args)

static String	format(String format, Object... args)

static String	join(CharSequence delimiter, CharSequence... elements)

static String	join(CharSequence delimiter, Iterable<? extends CharSequence> elements)

static String	valueOf(boolean b)

static String	valueOf(char c)

static String	valueOf(char[] data)

static String	valueOf(char[] data, int offset, int count)

static String	valueOf(double d)

static String	valueOf(float f)

static String	valueOf(int i)

static String	valueOf(long l)

static String	valueOf(Object obj)



class Instance Methods  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@


char	charAt(int index)

int	codePointAt(int index)

int	codePointBefore(int index)

int	codePointCount(int beginIndex, int endIndex)

int	compareTo(String anotherString)

int	compareToIgnoreCase(String str)

String	concat(String str)

boolean	contains(CharSequence s)

boolean	contentEquals(CharSequence cs)

boolean	contentEquals(StringBuffer sb)

boolean	endsWith(String suffix)

boolean	equals(Object anObject)

boolean	equalsIgnoreCase(String anotherString)

byte[]	getBytes()

byte[]	getBytes(Charset charset)

void	getBytes(int srcBegin, int srcEnd, byte[] dst, int dstBegin)

byte[]	getBytes(String charsetName)

void	getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

int	hashCode()

int	indexOf(int ch)

int	indexOf(int ch, int fromIndex)

int	indexOf(String str)

int	indexOf(String str, int fromIndex)

String	intern()

boolean	isEmpty()

int	lastIndexOf(int ch)

int	lastIndexOf(int ch, int fromIndex)

int	lastIndexOf(String str)

int	lastIndexOf(String str, int fromIndex)

int	length()

boolean	matches(String regex)

int	offsetByCodePoints(int index, int codePointOffset)

boolean	regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)

boolean	regionMatches(int toffset, String other, int ooffset, int len)

String	replace(char oldChar, char newChar)

String	replace(CharSequence target, CharSequence replacement)

String	replaceAll(String regex, String replacement)

String	replaceFirst(String regex, String replacement)

String[]	split(String regex)

String[]	split(String regex, int limit)

boolean	startsWith(String prefix)

boolean	startsWith(String prefix, int toffset)

CharSequence	subSequence(int beginIndex, int endIndex)

String	substring(int beginIndex)

String	substring(int beginIndex, int endIndex)

char[]	toCharArray()

String	toLowerCase()

String	toLowerCase(Locale locale)

String	toString()

String	toUpperCase()

String	toUpperCase(Locale locale)

String	trim()


class append


Appendable	append(char c)

Appendable	append(CharSequence csq)

Appendable	append(CharSequence csq, int start, int end)




class characters @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


char	charAt(int index)

int	length()

CharSequence	subSequence(int start, int end)

String	toString()





class ClassLoader  @@@@@@@@@@@@@@@@@@@@@@@@


void	clearAssertionStatus()

protected Class<?>	defineClass(byte[] b, int off, int len)

Replaced by defineClass(String, byte[], int, int)

protected Class<?>	defineClass(String name, byte[] b, int off, int len)

protected Class<?>	defineClass(String name, byte[] b, int off, int len, ProtectionDomain protectionDomain)

protected Class<?>	defineClass(String name, ByteBuffer b, ProtectionDomain protectionDomain)

protected Package	definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase)

protected Class<?>	findClass(String name)

protected String	findLibrary(String libname)

protected Class<?>	findLoadedClass(String name)

protected URL	findResource(String name)

protected Enumeration<URL>	findResources(String name)

protected Class<?>	findSystemClass(String name)

protected Object	getClassLoadingLock(String className)

protected Package	getPackage(String name)

protected Package[]	getPackages()

static ClassLoader	getSystemClassLoader()

static URL	getSystemResource(String name)

static InputStream	getSystemResourceAsStream(String name)

static Enumeration<URL>	getSystemResources(String name)

protected Class<?>	loadClass(String name, boolean resolve)

protected static boolean	registerAsParallelCapable()

protected void	resolveClass(Class<?> c)

void	setClassAssertionStatus(String className, boolean enabled)

void	setDefaultAssertionStatus(boolean enabled)

void	setPackageAssertionStatus(String packageName, boolean enabled)

protected void	setSigners(Class<?> c, Object[] signers)


class math  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


static double	abs(double a)

static float	abs(float a)

static int	abs(int a)

static long	abs(long a)

static double	acos(double a)

static double	asin(double a)

static double	atan(double a)

static double	atan2(double y, double x)

static double	cbrt(double a)

static double	ceil(double a)

static double	copySign(double magnitude, double sign)

static float	copySign(float magnitude, float sign)

static double	cos(double a)

static double	cosh(double x)

static double	exp(double a)

static double	expm1(double x)     Returns ex -1.

static double	floor(double a)

static int	getExponent(double d)

static int	getExponent(float f)

static double	hypot(double x, double y)

static double	IEEEremainder(double f1, double f2)

static double	log(double a)

static double	log10(double a)

static double	log1p(double x)

static double	max(double a, double b)

static float	max(float a, float b)

static int	max(int a, int b)

static long	max(long a, long b)

static double	min(double a, double b)

static float	min(float a, float b)

static int	min(int a, int b)

static long	min(long a, long b)

static double	nextAfter(double start, double direction)

static float	nextAfter(float start, double direction)

static double	nextUp(double d)

static float	nextUp(float f)

static double	pow(double a, double b)

static double	random()

static double	rint(double a)

static long	round(double a)

static int	round(float a)

static double	scalb(double d, int scaleFactor)

static float	scalb(float f, int scaleFactor)

static double	signum(double d)

static float	signum(float f)

static double	sin(double a)

static double	sinh(double x)

static double	sqrt(double a)

static double	tan(double a)

static double	tanh(double x)

static double	toDegrees(double angrad)

static double	toRadians(double angdeg)

static double	ulp(double d)

static float	ulp(float f)


class  Runtime  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@


void	addShutdownHook(Thread hook)
.
int	availableProcessors()

Process	exec(String command)

Process	exec(String[] cmdarray)

Process	exec(String[] cmdarray, String[] envp)

Process	exec(String[] cmdarray, String[] envp, File dir)

Process	exec(String command, String[] envp)

Process	exec(String command, String[] envp, File dir)

void	exit(int status)

long	freeMemory()

void	gc()

static Runtime	getRuntime()

void	halt(int status)

void	load(String filename)

void	loadLibrary(String libname)

long	maxMemory()

boolean	removeShutdownHook(Thread hook)

void	runFinalization()

static void	runFinalizersOnExit(boolean value)
 
long	totalMemory()

void	traceInstructions(boolean on)

void	traceMethodCalls(boolean on)



Class Short @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


byte	byteValue()

static int	compare(short x, short y)

int	compareTo(Short anotherShort)

static Short	decode(String nm)

double	doubleValue()

boolean	equals(Object obj)

float	floatValue()

int	hashCode()

int	intValue()

long	longValue()

static short	parseShort(String s)

static short	parseShort(String s, int radix)

static short	reverseBytes(short i)

short	shortValue()

String	toString()

static String	toString(short s)

static Short	valueOf(short s)

static Short	valueOf(String s)

static Short	valueOf(String s, int radix)


Class ProcessBuilder @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@


List<String>	command()

ProcessBuilder	command(List<String> command)

ProcessBuilder	command(String... command)

File	directory()

ProcessBuilder	directory(File directory)

Map<String,String>	environment()

ProcessBuilder	inheritIO()

ProcessBuilder.Redirect	redirectError()

ProcessBuilder	redirectError(File file)

ProcessBuilder	redirectError(ProcessBuilder.Redirect destination)

boolean	redirectErrorStream()

ProcessBuilder	redirectErrorStream(boolean redirectErrorStream)

ProcessBuilder.Redirect	redirectInput()

ProcessBuilder	redirectInput(File file)

ProcessBuilder	redirectInput(ProcessBuilder.Redirect source)

ProcessBuilder.Redirect	redirectOutput()

ProcessBuilder	redirectOutput(File file)

ProcessBuilder	redirectOutput(ProcessBuilder.Redirect destination)

Process	start()