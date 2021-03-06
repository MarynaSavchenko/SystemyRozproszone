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

public class Credit extends com.zeroc.Ice.Value
{
    public Credit()
    {
    }

    public Credit(double homeCurrency)
    {
        this.homeCurrency = homeCurrency;
    }

    public Credit(double homeCurrency, double foreignCurrency)
    {
        this.homeCurrency = homeCurrency;
        setForeignCurrency(foreignCurrency);
    }

    public double homeCurrency;

    private double foreignCurrency;
    private boolean _foreignCurrency;

    public double getForeignCurrency()
    {
        if(!_foreignCurrency)
        {
            throw new java.util.NoSuchElementException("foreignCurrency is not set");
        }
        return foreignCurrency;
    }

    public void setForeignCurrency(double foreignCurrency)
    {
        _foreignCurrency = true;
        this.foreignCurrency = foreignCurrency;
    }

    public boolean hasForeignCurrency()
    {
        return _foreignCurrency;
    }

    public void clearForeignCurrency()
    {
        _foreignCurrency = false;
    }

    public void optionalForeignCurrency(java.util.OptionalDouble v)
    {
        if(v == null || !v.isPresent())
        {
            _foreignCurrency = false;
        }
        else
        {
            _foreignCurrency = true;
            foreignCurrency = v.getAsDouble();
        }
    }

    public java.util.OptionalDouble optionalForeignCurrency()
    {
        if(_foreignCurrency)
        {
            return java.util.OptionalDouble.of(foreignCurrency);
        }
        else
        {
            return java.util.OptionalDouble.empty();
        }
    }

    public Credit clone()
    {
        return (Credit)super.clone();
    }

    public static String ice_staticId()
    {
        return "::Accounts::Credit";
    }

    @Override
    public String ice_id()
    {
        return ice_staticId();
    }

    /** @hidden */
    public static final long serialVersionUID = -5374499547363977537L;

    /** @hidden */
    @Override
    protected void _iceWriteImpl(com.zeroc.Ice.OutputStream ostr_)
    {
        ostr_.startSlice(ice_staticId(), -1, true);
        ostr_.writeDouble(homeCurrency);
        if(_foreignCurrency)
        {
            ostr_.writeDouble(1, foreignCurrency);
        }
        ostr_.endSlice();
    }

    /** @hidden */
    @Override
    protected void _iceReadImpl(com.zeroc.Ice.InputStream istr_)
    {
        istr_.startSlice();
        homeCurrency = istr_.readDouble();
        if(_foreignCurrency = istr_.readOptional(1, com.zeroc.Ice.OptionalFormat.F8))
        {
            foreignCurrency = istr_.readDouble();
        }
        istr_.endSlice();
    }
}
