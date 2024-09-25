package vn.tapbi.arteditor.data.local.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import vn.tapbi.arteditor.common.Constant
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel


@Database(entities = [UnsplashPhotoModel::class], version = Constant.DB_VERSION)
abstract class TapbiDb : RoomDatabase() {
    abstract val unSplashDao: UnSplashDao

    companion object {
        val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {}
        }
        val MIGRATION_2_3: Migration = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {}
        }
    }

}
