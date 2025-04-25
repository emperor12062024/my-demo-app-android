package com.saucelabs.mydemoapp.android.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.saucelabs.mydemoapp.android.model.ColorModel;
import com.saucelabs.mydemoapp.android.model.ColorModelConverters;
import com.saucelabs.mydemoapp.android.model.ProductModel;
import com.saucelabs.mydemoapp.android.model.User;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDao_Impl implements AppDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final EntityInsertionAdapter<ProductModel> __insertionAdapterOfProductModel;

  private final EntityDeletionOrUpdateAdapter<User> __deletionAdapterOfUser;

  private final EntityDeletionOrUpdateAdapter<User> __updateAdapterOfUser;

  public AppDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `person` (`id`,`name`,`email`,`number`,`pincode`,`city`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNumber());
        }
        if (value.getPincode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPincode());
        }
        if (value.getCity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCity());
        }
      }
    };
    this.__insertionAdapterOfProductModel = new EntityInsertionAdapter<ProductModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Product` (`id`,`title`,`price`,`rating`,`colors`,`desc`,`currency`,`image`,`imageVal`,`colorList`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ProductModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindDouble(3, value.getPrice());
        stmt.bindLong(4, value.getRating());
        stmt.bindLong(5, value.getColors());
        if (value.getDesc() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDesc());
        }
        if (value.getCurrency() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCurrency());
        }
        if (value.getImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindBlob(8, value.getImage());
        }
        stmt.bindLong(9, value.getImageVal());
        final String _tmp = ColorModelConverters.someObjectListToString(value.getColorList());
        if (_tmp == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp);
        }
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `person` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `person` SET `id` = ?,`name` = ?,`email` = ?,`number` = ?,`pincode` = ?,`city` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getEmail());
        }
        if (value.getNumber() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getNumber());
        }
        if (value.getPincode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPincode());
        }
        if (value.getCity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCity());
        }
        stmt.bindLong(7, value.getId());
      }
    };
  }

  @Override
  public void insertPerson(final User person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser.insert(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertProduct(final ProductModel person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProductModel.insert(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertProduct(final List<ProductModel> person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfProductModel.insert(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final User person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfUser.handle(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePerson(final User person) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfUser.handle(person);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<User> loadAllPersons() {
    final String _sql = "SELECT * FROM person ORDER BY ID";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
      final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpNumber;
        if (_cursor.isNull(_cursorIndexOfNumber)) {
          _tmpNumber = null;
        } else {
          _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
        }
        final String _tmpPincode;
        if (_cursor.isNull(_cursorIndexOfPincode)) {
          _tmpPincode = null;
        } else {
          _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
        }
        final String _tmpCity;
        if (_cursor.isNull(_cursorIndexOfCity)) {
          _tmpCity = null;
        } else {
          _tmpCity = _cursor.getString(_cursorIndexOfCity);
        }
        _item = new User(_tmpId,_tmpName,_tmpEmail,_tmpNumber,_tmpPincode,_tmpCity);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public User loadPersonById(final int id) {
    final String _sql = "SELECT * FROM person WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "number");
      final int _cursorIndexOfPincode = CursorUtil.getColumnIndexOrThrow(_cursor, "pincode");
      final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
      final User _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpNumber;
        if (_cursor.isNull(_cursorIndexOfNumber)) {
          _tmpNumber = null;
        } else {
          _tmpNumber = _cursor.getString(_cursorIndexOfNumber);
        }
        final String _tmpPincode;
        if (_cursor.isNull(_cursorIndexOfPincode)) {
          _tmpPincode = null;
        } else {
          _tmpPincode = _cursor.getString(_cursorIndexOfPincode);
        }
        final String _tmpCity;
        if (_cursor.isNull(_cursorIndexOfCity)) {
          _tmpCity = null;
        } else {
          _tmpCity = _cursor.getString(_cursorIndexOfCity);
        }
        _result = new User(_tmpId,_tmpName,_tmpEmail,_tmpNumber,_tmpPincode,_tmpCity);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ProductModel> getAllProducts() {
    final String _sql = "SELECT * FROM Product ORDER BY ID";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfImageVal = CursorUtil.getColumnIndexOrThrow(_cursor, "imageVal");
      final int _cursorIndexOfColorList = CursorUtil.getColumnIndexOrThrow(_cursor, "colorList");
      final List<ProductModel> _result = new ArrayList<ProductModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ProductModel _item;
        _item = new ProductModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpRating;
        _tmpRating = _cursor.getInt(_cursorIndexOfRating);
        _item.setRating(_tmpRating);
        final int _tmpColors;
        _tmpColors = _cursor.getInt(_cursorIndexOfColors);
        _item.setColors(_tmpColors);
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        _item.setDesc(_tmpDesc);
        final String _tmpCurrency;
        if (_cursor.isNull(_cursorIndexOfCurrency)) {
          _tmpCurrency = null;
        } else {
          _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
        }
        _item.setCurrency(_tmpCurrency);
        final byte[] _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        }
        _item.setImage(_tmpImage);
        final int _tmpImageVal;
        _tmpImageVal = _cursor.getInt(_cursorIndexOfImageVal);
        _item.setImageVal(_tmpImageVal);
        final List<ColorModel> _tmpColorList;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfColorList)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfColorList);
        }
        _tmpColorList = ColorModelConverters.stringToSomeObjectList(_tmp);
        _item.setColorList(_tmpColorList);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ProductModel> getPersonsSortByAscPrice() {
    final String _sql = "SELECT * FROM Product ORDER BY price ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfImageVal = CursorUtil.getColumnIndexOrThrow(_cursor, "imageVal");
      final int _cursorIndexOfColorList = CursorUtil.getColumnIndexOrThrow(_cursor, "colorList");
      final List<ProductModel> _result = new ArrayList<ProductModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ProductModel _item;
        _item = new ProductModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpRating;
        _tmpRating = _cursor.getInt(_cursorIndexOfRating);
        _item.setRating(_tmpRating);
        final int _tmpColors;
        _tmpColors = _cursor.getInt(_cursorIndexOfColors);
        _item.setColors(_tmpColors);
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        _item.setDesc(_tmpDesc);
        final String _tmpCurrency;
        if (_cursor.isNull(_cursorIndexOfCurrency)) {
          _tmpCurrency = null;
        } else {
          _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
        }
        _item.setCurrency(_tmpCurrency);
        final byte[] _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        }
        _item.setImage(_tmpImage);
        final int _tmpImageVal;
        _tmpImageVal = _cursor.getInt(_cursorIndexOfImageVal);
        _item.setImageVal(_tmpImageVal);
        final List<ColorModel> _tmpColorList;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfColorList)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfColorList);
        }
        _tmpColorList = ColorModelConverters.stringToSomeObjectList(_tmp);
        _item.setColorList(_tmpColorList);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ProductModel> getPersonsSortByDescPrice() {
    final String _sql = "SELECT * FROM Product ORDER BY price DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfImageVal = CursorUtil.getColumnIndexOrThrow(_cursor, "imageVal");
      final int _cursorIndexOfColorList = CursorUtil.getColumnIndexOrThrow(_cursor, "colorList");
      final List<ProductModel> _result = new ArrayList<ProductModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ProductModel _item;
        _item = new ProductModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpRating;
        _tmpRating = _cursor.getInt(_cursorIndexOfRating);
        _item.setRating(_tmpRating);
        final int _tmpColors;
        _tmpColors = _cursor.getInt(_cursorIndexOfColors);
        _item.setColors(_tmpColors);
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        _item.setDesc(_tmpDesc);
        final String _tmpCurrency;
        if (_cursor.isNull(_cursorIndexOfCurrency)) {
          _tmpCurrency = null;
        } else {
          _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
        }
        _item.setCurrency(_tmpCurrency);
        final byte[] _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        }
        _item.setImage(_tmpImage);
        final int _tmpImageVal;
        _tmpImageVal = _cursor.getInt(_cursorIndexOfImageVal);
        _item.setImageVal(_tmpImageVal);
        final List<ColorModel> _tmpColorList;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfColorList)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfColorList);
        }
        _tmpColorList = ColorModelConverters.stringToSomeObjectList(_tmp);
        _item.setColorList(_tmpColorList);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ProductModel> getPersonsSortByAscName() {
    final String _sql = "SELECT * FROM Product ORDER BY title ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfImageVal = CursorUtil.getColumnIndexOrThrow(_cursor, "imageVal");
      final int _cursorIndexOfColorList = CursorUtil.getColumnIndexOrThrow(_cursor, "colorList");
      final List<ProductModel> _result = new ArrayList<ProductModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ProductModel _item;
        _item = new ProductModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpRating;
        _tmpRating = _cursor.getInt(_cursorIndexOfRating);
        _item.setRating(_tmpRating);
        final int _tmpColors;
        _tmpColors = _cursor.getInt(_cursorIndexOfColors);
        _item.setColors(_tmpColors);
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        _item.setDesc(_tmpDesc);
        final String _tmpCurrency;
        if (_cursor.isNull(_cursorIndexOfCurrency)) {
          _tmpCurrency = null;
        } else {
          _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
        }
        _item.setCurrency(_tmpCurrency);
        final byte[] _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        }
        _item.setImage(_tmpImage);
        final int _tmpImageVal;
        _tmpImageVal = _cursor.getInt(_cursorIndexOfImageVal);
        _item.setImageVal(_tmpImageVal);
        final List<ColorModel> _tmpColorList;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfColorList)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfColorList);
        }
        _tmpColorList = ColorModelConverters.stringToSomeObjectList(_tmp);
        _item.setColorList(_tmpColorList);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ProductModel> getPersonsSortByDescName() {
    final String _sql = "SELECT * FROM Product ORDER BY title DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfImageVal = CursorUtil.getColumnIndexOrThrow(_cursor, "imageVal");
      final int _cursorIndexOfColorList = CursorUtil.getColumnIndexOrThrow(_cursor, "colorList");
      final List<ProductModel> _result = new ArrayList<ProductModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ProductModel _item;
        _item = new ProductModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _item.setId(_tmpId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _item.setTitle(_tmpTitle);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        _item.setPrice(_tmpPrice);
        final int _tmpRating;
        _tmpRating = _cursor.getInt(_cursorIndexOfRating);
        _item.setRating(_tmpRating);
        final int _tmpColors;
        _tmpColors = _cursor.getInt(_cursorIndexOfColors);
        _item.setColors(_tmpColors);
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        _item.setDesc(_tmpDesc);
        final String _tmpCurrency;
        if (_cursor.isNull(_cursorIndexOfCurrency)) {
          _tmpCurrency = null;
        } else {
          _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
        }
        _item.setCurrency(_tmpCurrency);
        final byte[] _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        }
        _item.setImage(_tmpImage);
        final int _tmpImageVal;
        _tmpImageVal = _cursor.getInt(_cursorIndexOfImageVal);
        _item.setImageVal(_tmpImageVal);
        final List<ColorModel> _tmpColorList;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfColorList)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfColorList);
        }
        _tmpColorList = ColorModelConverters.stringToSomeObjectList(_tmp);
        _item.setColorList(_tmpColorList);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ProductModel getProduct(final int id) {
    final String _sql = "SELECT * FROM Product WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfColors = CursorUtil.getColumnIndexOrThrow(_cursor, "colors");
      final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
      final int _cursorIndexOfCurrency = CursorUtil.getColumnIndexOrThrow(_cursor, "currency");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfImageVal = CursorUtil.getColumnIndexOrThrow(_cursor, "imageVal");
      final int _cursorIndexOfColorList = CursorUtil.getColumnIndexOrThrow(_cursor, "colorList");
      final ProductModel _result;
      if(_cursor.moveToFirst()) {
        _result = new ProductModel();
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        _result.setTitle(_tmpTitle);
        final double _tmpPrice;
        _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
        _result.setPrice(_tmpPrice);
        final int _tmpRating;
        _tmpRating = _cursor.getInt(_cursorIndexOfRating);
        _result.setRating(_tmpRating);
        final int _tmpColors;
        _tmpColors = _cursor.getInt(_cursorIndexOfColors);
        _result.setColors(_tmpColors);
        final String _tmpDesc;
        if (_cursor.isNull(_cursorIndexOfDesc)) {
          _tmpDesc = null;
        } else {
          _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
        }
        _result.setDesc(_tmpDesc);
        final String _tmpCurrency;
        if (_cursor.isNull(_cursorIndexOfCurrency)) {
          _tmpCurrency = null;
        } else {
          _tmpCurrency = _cursor.getString(_cursorIndexOfCurrency);
        }
        _result.setCurrency(_tmpCurrency);
        final byte[] _tmpImage;
        if (_cursor.isNull(_cursorIndexOfImage)) {
          _tmpImage = null;
        } else {
          _tmpImage = _cursor.getBlob(_cursorIndexOfImage);
        }
        _result.setImage(_tmpImage);
        final int _tmpImageVal;
        _tmpImageVal = _cursor.getInt(_cursorIndexOfImageVal);
        _result.setImageVal(_tmpImageVal);
        final List<ColorModel> _tmpColorList;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfColorList)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfColorList);
        }
        _tmpColorList = ColorModelConverters.stringToSomeObjectList(_tmp);
        _result.setColorList(_tmpColorList);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
