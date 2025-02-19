**Stream** 
1. is an ordered sequence of data
2. 2 categories of stream: Byte stream->Binary data, Text stream->Unicode characters

**Streams for Reading**
1. Base class to read from binary data:InputStream -> int read()
2. Base class to read from Text DataL :Reader      -> int read()

**Stream for Writing**
1. OutputStream 
2. Writer

Derived Classed
InputStream-> ByteArrayInputStream,PipedInputStream,FileInputStream
OutputStream-> ByteArrayOutputStream,PipedOutputStream,FileOutputStream

Read Text content
Reader->CharArrayReader,StringReader,PipedReader,InputStreamReader(Text stream)
Writer->CharArrayWriter,StringWriter,PipedWriter,OutStreamWriter

try with Resources (Used for stream that implements Autocloseable interface i.e it automatically calls close method)
e.getSuppressed(): returns Throwable array:Can list all suppressed exception

java.util.nio package
-> Better Exception Handling
-> Greater scalability
-> More file system feature
-> simplified file operations

Path 
-> used to locate a file in file system
-> can be file or directory
-> static path or string based hierarchical path,URI
-> Paths.get("C:/Users/username/Desktop/Java/Threads/synchronised/Readme.md")
-> Paths.get("C:","Users","username","Desktop","Java","Threads","synchronised","Readme.md")
-> open file system
-> newBufferedReader,newBufferedWriter, newBufferedInputStream, newBufferedOutputStream
-> read/write file content
-> Files.readAllLines, Files.write, Files.copy, Files.move, Files.delete, Files.createDirectory, Files.createFile, Files.createTempFile







