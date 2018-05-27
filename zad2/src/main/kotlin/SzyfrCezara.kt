fun main (string: Array<String>) {
    val encrypted = """fgbv an fgnpwv ybxbzbgljn,
                       pvrmxn, btebzan v cbg m avrw fcyljn:
                       gyhfgn byvjn.
                       fgbv v fncvr, qlfml v qzhpun,
                       mne m ebmtemnartb wrw oemhpun ohpun:
                       ohpu - wnx tbenpb!
                       hpu - wnx tbenpb!
                       chss - wnx tbenpb!
                       hss - wnx tbenpb!
                       whm yrqjb fncvr, whm yrqjb mvcvr,
                       n wrfmpmr cnynpm jrtvry j avn flcvr.""".trimMargin()

    val decrypted = decryptCaesar(encrypted, 13)
for (i in 0 until decrypted.length)
    println(decrypted)
}

fun decryptCaesar(encrypted : String, key : Int) : String{
    TODO()
}