namespace High_M_Music_Records.Models
{
    using System;
    using System.Data.Entity;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Linq;

    public partial class HighMMusicRecordsModel : DbContext
    {
        public HighMMusicRecordsModel()
            : base("name=HighMMusicRecordsModel")
        {
        }

        public virtual DbSet<ArtistsAlbum> ArtistsAlbum { get; set; }
        public virtual DbSet<Table_1> Table_1 { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Entity<ArtistsAlbum>()
                .Property(e => e.Title)
                .IsUnicode(false);

            modelBuilder.Entity<ArtistsAlbum>()
                .Property(e => e.Genre)
                .IsUnicode(false);

            modelBuilder.Entity<ArtistsAlbum>()
                .Property(e => e.Name_of_Song)
                .IsUnicode(false);

            modelBuilder.Entity<ArtistsAlbum>()
                .Property(e => e.Artist_name)
                .IsUnicode(false);

            modelBuilder.Entity<Table_1>()
                .Property(e => e.Title)
                .IsUnicode(false);

            modelBuilder.Entity<Table_1>()
                .Property(e => e.Genre)
                .IsUnicode(false);

            modelBuilder.Entity<Table_1>()
                .Property(e => e.Name_of_Song)
                .IsUnicode(false);

            modelBuilder.Entity<Table_1>()
                .Property(e => e.Artist)
                .IsUnicode(false);
        }
    }
}
