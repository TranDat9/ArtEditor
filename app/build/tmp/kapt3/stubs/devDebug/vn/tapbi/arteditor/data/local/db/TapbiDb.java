package vn.tapbi.arteditor.data.local.db;

import java.lang.System;

@androidx.room.Database(entities = {vn.tapbi.arteditor.data.model.UnsplashPhotoModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lvn/tapbi/arteditor/data/local/db/TapbiDb;", "Landroidx/room/RoomDatabase;", "()V", "unSplashDao", "Lvn/tapbi/arteditor/data/local/db/UnSplashDao;", "getUnSplashDao", "()Lvn/tapbi/arteditor/data/local/db/UnSplashDao;", "Companion", "app_devDebug"})
public abstract class TapbiDb extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final vn.tapbi.arteditor.data.local.db.TapbiDb.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_1_2 = null;
    @org.jetbrains.annotations.NotNull
    private static final androidx.room.migration.Migration MIGRATION_2_3 = null;
    
    public TapbiDb() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract vn.tapbi.arteditor.data.local.db.UnSplashDao getUnSplashDao();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lvn/tapbi/arteditor/data/local/db/TapbiDb$Companion;", "", "()V", "MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "MIGRATION_2_3", "getMIGRATION_2_3", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.room.migration.Migration getMIGRATION_1_2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.room.migration.Migration getMIGRATION_2_3() {
            return null;
        }
    }
}