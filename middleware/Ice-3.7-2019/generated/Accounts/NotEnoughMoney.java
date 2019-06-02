//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.2
//
// <auto-generated>
//
// Generated from file `bank.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package Accounts;

public class NotEnoughMoney extends BankException
{
    public NotEnoughMoney()
    {
        super();
    }

    public NotEnoughMoney(Throwable cause)
    {
        super(cause);
    }

    public NotEnoughMoney(String message)
    {
        super(message);
    }

    public NotEnoughMoney(String message, Throwable cause)
    {
        super(message, cause);
    }

    public String ice_id()
    {
        return "::Accounts::NotEnoughMoney";
    }

    /** @hidden */
    @Override
    protected void _writeImpl(com.zeroc.Ice.OutputStream ostr_)
    {
        ostr_.startSlice("::Accounts::NotEnoughMoney", -1, false);
        ostr_.endSlice();
        super._writeImpl(ostr_);
    }

    /** @hidden */
    @Override
    protected void _readImpl(com.zeroc.Ice.InputStream istr_)
    {
        istr_.startSlice();
        istr_.endSlice();
        super._readImpl(istr_);
    }

    /** @hidden */
    public static final long serialVersionUID = -7137561245444208786L;
}
