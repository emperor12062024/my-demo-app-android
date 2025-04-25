package com.saucelabs.mydemoapp.android.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AppDao _appDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `person` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT, `email` TEXT, `number` TEXT, `pincode` TEXT, `city` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Product` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `price` REAL NOT NULL, `rating` INTEGER NOT NULL, `colors` INTEGER NOT NULL, `desc` TEXT, `currency` TEXT, `image` BLOB, `imageVal` INTEGER NOT NULL, `colorList` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9d9b525401de32286ffa0a6d7a432ce1')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `person`");
        _db.execSQL("DROP TABLE IF EXISTS `Product`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsPerson = new HashMap<String, TableInfo.Column>(6);
        _columnsPerson.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPerson.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPerson.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPerson.put("number", new TableInfo.Column("number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPerson.put("pincode", new TableInfo.Column("pincode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPerson.put("city", new TableInfo.Column("city", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPerson = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPerson = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPerson = new TableInfo("person", _columnsPerson, _foreignKeysPerson, _indicesPerson);
        final TableInfo _existingPerson = TableInfo.read(_db, "person");
        if (! _infoPerson.equals(_existingPerson)) {
          return new RoomOpenHelper.ValidationResult(false, "person(com.saucelabs.mydemoapp.android.model.User).\n"
                  + " Expected:\n" + _infoPerson + "\n"
                  + " Found:\n" + _existingPerson);
        }
        final HashMap<String, TableInfo.Column> _columnsProduct = new HashMap<String, TableInfo.Column>(10);
        _columnsProduct.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("price", new TableInfo.Column("price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("rating", new TableInfo.Column("rating", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("colors", new TableInfo.Column("colors", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("desc", new TableInfo.Column("desc", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("currency", new TableInfo.Column("currency", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("image", new TableInfo.Column("image", "BLOB", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("imageVal", new TableInfo.Column("imageVal", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProduct.put("colorList", new TableInfo.Column("colorList", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProduct = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesProduct = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProduct = new TableInfo("Product", _columnsProduct, _foreignKeysProduct, _indicesProduct);
        final TableInfo _existingProduct = TableInfo.read(_db, "Product");
        if (! _infoProduct.equals(_existingProduct)) {
          return new RoomOpenHelper.ValidationResult(false, "Product(com.saucelabs.mydemoapp.android.model.ProductModel).\n"
                  + " Expected:\n" + _infoProduct + "\n"
                  + " Found:\n" + _existingProduct);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "9d9b525401de32286ffa0a6d7a432ce1", "a22067b01d3fa902d2643be60cfb3221");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "person","Product");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `person`");
      _db.execSQL("DELETE FROM `Product`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AppDao.class, AppDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public AppDao personDao() {
    if (_appDao != null) {
      return _appDao;
    } else {
      synchronized(this) {
        if(_appDao == null) {
          _appDao = new AppDao_Impl(this);
        }
        return _appDao;
      }
    }
  }
}
