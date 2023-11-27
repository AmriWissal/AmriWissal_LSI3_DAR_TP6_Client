package CorbaConversion;


/**
* CorbaConversion/IConversionRemoteHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Conversion.IDL
* lundi 27 novembre 2023 14 h 35 GMT+01:00
*/

abstract public class IConversionRemoteHelper
{
  private static String  _id = "IDL:CorbaConversion/IConversionRemote:1.0";

  public static void insert (org.omg.CORBA.Any a, CorbaConversion.IConversionRemote that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CorbaConversion.IConversionRemote extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CorbaConversion.IConversionRemoteHelper.id (), "IConversionRemote");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CorbaConversion.IConversionRemote read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_IConversionRemoteStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CorbaConversion.IConversionRemote value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CorbaConversion.IConversionRemote narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CorbaConversion.IConversionRemote)
      return (CorbaConversion.IConversionRemote)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CorbaConversion._IConversionRemoteStub stub = new CorbaConversion._IConversionRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CorbaConversion.IConversionRemote unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CorbaConversion.IConversionRemote)
      return (CorbaConversion.IConversionRemote)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CorbaConversion._IConversionRemoteStub stub = new CorbaConversion._IConversionRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
