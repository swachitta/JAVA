Assigned Date:2021/12/28                                                                                 Due date:2021/01/04


     Streams
     Streams is a new abstract layer introduced in java 8.Using stream,you can process datadata in declarative way similar to SQL
     statements.It is necessary to have an ability to read and write data.JAva Provides streams as a general mechansim for dealing 
     with I/O.A stream is  logical entity that either produces or consumes information .Streams implement sequential access of data.
     two types of streams::
     1)Input Stream:an object from which we can read a sequence of bytes.
     2)Output stream:an object from which we can write a sequence of bytes.
  The input acts as a source of data whereas the output stream acts as a destination of file.
  
  
  Zip File Stream
  __________________________________________________________________________________
  
    Zip files are the archives that store one or more files in compressed form.The java.util.zip contains the classes for 
    working with zip files. Each zip files has a header which includes information like name of the file and the
    compression method used like GZIP and ZIP.ZipInputStream() used to read a Zip file by layering the zipinputStream 
    constructor on to  a FileInputStream().We then need to look at the individual entries in the archeive.
    
    
    
    Object Stream
    ______________________________________________________________________________
    It ssupport I/O of objects.Most, but not all, standard classes support serialixation of their objects. Object stream is useful 
    while reading and writing objects that are created using different datatypes. E.g. we may have an array of student records but 
    contains objects that objects that are actually instances of a child class. If we have to save files that contain such information
    then we must first save the type of each object.And, when we read,then we have to read the object type the create blank object 
    followed by filling of the data have been stored in the file.
    
    This entire process is automated by the object Serialixation mechanism.Object serialixation is an approach by which an object can be
    represented as a sequence of bytes that contains the object data and other information like the types of data stored,etc.
     
     
