package vn.tapbi.arteditor.data.local.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class UnSplashDao_Impl implements UnSplashDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<UnsplashPhotoModel> __insertionAdapterOfUnsplashPhotoModel;

  public UnSplashDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUnsplashPhotoModel = new EntityInsertionAdapter<UnsplashPhotoModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `photo` (`photoId`,`nameTopic`,`photoLink`,`photoUrl`,`like`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UnsplashPhotoModel value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getNameTopic() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNameTopic());
        }
        if (value.getLinksParse() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLinksParse());
        }
        if (value.getUrlsParse() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrlsParse());
        }
        final int _tmp = value.getLike() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    };
  }

  @Override
  public Object insertAll(final List<UnsplashPhotoModel> photos,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfUnsplashPhotoModel.insert(photos);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<UnsplashPhotoModel>> getAllPhotos() {
    final String _sql = "SELECT * FROM photo";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"photo"}, false, new Callable<List<UnsplashPhotoModel>>() {
      @Override
      public List<UnsplashPhotoModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "photoId");
          final int _cursorIndexOfNameTopic = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTopic");
          final int _cursorIndexOfLinksParse = CursorUtil.getColumnIndexOrThrow(_cursor, "photoLink");
          final int _cursorIndexOfUrlsParse = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUrl");
          final int _cursorIndexOfLike = CursorUtil.getColumnIndexOrThrow(_cursor, "like");
          final List<UnsplashPhotoModel> _result = new ArrayList<UnsplashPhotoModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UnsplashPhotoModel _item;
            _item = new UnsplashPhotoModel();
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final String _tmpNameTopic;
            if (_cursor.isNull(_cursorIndexOfNameTopic)) {
              _tmpNameTopic = null;
            } else {
              _tmpNameTopic = _cursor.getString(_cursorIndexOfNameTopic);
            }
            _item.setNameTopic(_tmpNameTopic);
            final String _tmpLinksParse;
            if (_cursor.isNull(_cursorIndexOfLinksParse)) {
              _tmpLinksParse = null;
            } else {
              _tmpLinksParse = _cursor.getString(_cursorIndexOfLinksParse);
            }
            _item.setLinksParse(_tmpLinksParse);
            final String _tmpUrlsParse;
            if (_cursor.isNull(_cursorIndexOfUrlsParse)) {
              _tmpUrlsParse = null;
            } else {
              _tmpUrlsParse = _cursor.getString(_cursorIndexOfUrlsParse);
            }
            _item.setUrlsParse(_tmpUrlsParse);
            final boolean _tmpLike;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfLike);
            _tmpLike = _tmp != 0;
            _item.setLike(_tmpLike);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<UnsplashPhotoModel>> getPhotosByTopic(final String topicName) {
    final String _sql = "SELECT * FROM photo WHERE nameTopic = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (topicName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, topicName);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"photo"}, false, new Callable<List<UnsplashPhotoModel>>() {
      @Override
      public List<UnsplashPhotoModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "photoId");
          final int _cursorIndexOfNameTopic = CursorUtil.getColumnIndexOrThrow(_cursor, "nameTopic");
          final int _cursorIndexOfLinksParse = CursorUtil.getColumnIndexOrThrow(_cursor, "photoLink");
          final int _cursorIndexOfUrlsParse = CursorUtil.getColumnIndexOrThrow(_cursor, "photoUrl");
          final int _cursorIndexOfLike = CursorUtil.getColumnIndexOrThrow(_cursor, "like");
          final List<UnsplashPhotoModel> _result = new ArrayList<UnsplashPhotoModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final UnsplashPhotoModel _item;
            _item = new UnsplashPhotoModel();
            final String _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getString(_cursorIndexOfId);
            }
            _item.setId(_tmpId);
            final String _tmpNameTopic;
            if (_cursor.isNull(_cursorIndexOfNameTopic)) {
              _tmpNameTopic = null;
            } else {
              _tmpNameTopic = _cursor.getString(_cursorIndexOfNameTopic);
            }
            _item.setNameTopic(_tmpNameTopic);
            final String _tmpLinksParse;
            if (_cursor.isNull(_cursorIndexOfLinksParse)) {
              _tmpLinksParse = null;
            } else {
              _tmpLinksParse = _cursor.getString(_cursorIndexOfLinksParse);
            }
            _item.setLinksParse(_tmpLinksParse);
            final String _tmpUrlsParse;
            if (_cursor.isNull(_cursorIndexOfUrlsParse)) {
              _tmpUrlsParse = null;
            } else {
              _tmpUrlsParse = _cursor.getString(_cursorIndexOfUrlsParse);
            }
            _item.setUrlsParse(_tmpUrlsParse);
            final boolean _tmpLike;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfLike);
            _tmpLike = _tmp != 0;
            _item.setLike(_tmpLike);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public PagingSource<Integer, UnsplashPhotoModel> getPhotosByCategory(final String category) {
    final String _sql = "SELECT * FROM photo WHERE nameTopic = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    return new LimitOffsetPagingSource<UnsplashPhotoModel>(_statement, __db, "photo") {
      @Override
      protected List<UnsplashPhotoModel> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "photoId");
        final int _cursorIndexOfNameTopic = CursorUtil.getColumnIndexOrThrow(cursor, "nameTopic");
        final int _cursorIndexOfLinksParse = CursorUtil.getColumnIndexOrThrow(cursor, "photoLink");
        final int _cursorIndexOfUrlsParse = CursorUtil.getColumnIndexOrThrow(cursor, "photoUrl");
        final int _cursorIndexOfLike = CursorUtil.getColumnIndexOrThrow(cursor, "like");
        final List<UnsplashPhotoModel> _result = new ArrayList<UnsplashPhotoModel>(cursor.getCount());
        while(cursor.moveToNext()) {
          final UnsplashPhotoModel _item;
          _item = new UnsplashPhotoModel();
          final String _tmpId;
          if (cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = cursor.getString(_cursorIndexOfId);
          }
          _item.setId(_tmpId);
          final String _tmpNameTopic;
          if (cursor.isNull(_cursorIndexOfNameTopic)) {
            _tmpNameTopic = null;
          } else {
            _tmpNameTopic = cursor.getString(_cursorIndexOfNameTopic);
          }
          _item.setNameTopic(_tmpNameTopic);
          final String _tmpLinksParse;
          if (cursor.isNull(_cursorIndexOfLinksParse)) {
            _tmpLinksParse = null;
          } else {
            _tmpLinksParse = cursor.getString(_cursorIndexOfLinksParse);
          }
          _item.setLinksParse(_tmpLinksParse);
          final String _tmpUrlsParse;
          if (cursor.isNull(_cursorIndexOfUrlsParse)) {
            _tmpUrlsParse = null;
          } else {
            _tmpUrlsParse = cursor.getString(_cursorIndexOfUrlsParse);
          }
          _item.setUrlsParse(_tmpUrlsParse);
          final boolean _tmpLike;
          final int _tmp;
          _tmp = cursor.getInt(_cursorIndexOfLike);
          _tmpLike = _tmp != 0;
          _item.setLike(_tmpLike);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
