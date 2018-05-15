fun main(strin: Array<String>) {
    val encrypted = """fgbv an fgnpwv ybxbzbgljn,
                        pvężxn, btebzan v cbg m avrw fcłljn:
                        głhfgn byvjn.
                        fgbv v fncvr, qlfml v qzhpun,
                        żne m ebmtemnartb wrw oemhpun ohpun:
                        ohpu - wnx tbeąpb!
                        hpu - wnx tbeąpb!
                        chss - wnx tbeąpb!
                        hss - wnx tbeąpb!
                        whż yrqjb fncvr, whż yrqjb mvcvr,
                        n wrfmpmr cnynpm jętvry j avą flcvr.""".trimMargin()

    val decrypted = decrypt(encrypted,13)

    println(decrypted)
}

fun decrypt(encrypted : String, key : Int) : String{
    TODO()
}