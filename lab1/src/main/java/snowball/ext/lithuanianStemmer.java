// Generated by Snowball 2.0.0 - https://snowballstem.org/

package snowball.ext;

import snowball.Among;
import snowball.SnowballStemmer;

/**
 * This class implements the stemming algorithm defined by a snowball script.
 * <p>
 * Generated by Snowball 2.0.0 - https://snowballstem.org/
 * </p>
 */
@SuppressWarnings("unused")
public class lithuanianStemmer extends SnowballStemmer {

    private static final long serialVersionUID = 1L;

private final static Among a_0[] = {
    new Among("a", -1, -1),
    new Among("ia", 0, -1),
    new Among("eria", 1, -1),
    new Among("osna", 0, -1),
    new Among("iosna", 3, -1),
    new Among("uosna", 3, -1),
    new Among("iuosna", 5, -1),
    new Among("ysna", 0, -1),
    new Among("\u0117sna", 0, -1),
    new Among("e", -1, -1),
    new Among("ie", 9, -1),
    new Among("enie", 10, -1),
    new Among("erie", 10, -1),
    new Among("oje", 9, -1),
    new Among("ioje", 13, -1),
    new Among("uje", 9, -1),
    new Among("iuje", 15, -1),
    new Among("yje", 9, -1),
    new Among("enyje", 17, -1),
    new Among("eryje", 17, -1),
    new Among("\u0117je", 9, -1),
    new Among("ame", 9, -1),
    new Among("iame", 21, -1),
    new Among("sime", 9, -1),
    new Among("ome", 9, -1),
    new Among("\u0117me", 9, -1),
    new Among("tum\u0117me", 25, -1),
    new Among("ose", 9, -1),
    new Among("iose", 27, -1),
    new Among("uose", 27, -1),
    new Among("iuose", 29, -1),
    new Among("yse", 9, -1),
    new Among("enyse", 31, -1),
    new Among("eryse", 31, -1),
    new Among("\u0117se", 9, -1),
    new Among("ate", 9, -1),
    new Among("iate", 35, -1),
    new Among("ite", 9, -1),
    new Among("kite", 37, -1),
    new Among("site", 37, -1),
    new Among("ote", 9, -1),
    new Among("tute", 9, -1),
    new Among("\u0117te", 9, -1),
    new Among("tum\u0117te", 42, -1),
    new Among("i", -1, -1),
    new Among("ai", 44, -1),
    new Among("iai", 45, -1),
    new Among("eriai", 46, -1),
    new Among("ei", 44, -1),
    new Among("tumei", 48, -1),
    new Among("ki", 44, -1),
    new Among("imi", 44, -1),
    new Among("erimi", 51, -1),
    new Among("umi", 44, -1),
    new Among("iumi", 53, -1),
    new Among("si", 44, -1),
    new Among("asi", 55, -1),
    new Among("iasi", 56, -1),
    new Among("esi", 55, -1),
    new Among("iesi", 58, -1),
    new Among("siesi", 59, -1),
    new Among("isi", 55, -1),
    new Among("aisi", 61, -1),
    new Among("eisi", 61, -1),
    new Among("tumeisi", 63, -1),
    new Among("uisi", 61, -1),
    new Among("osi", 55, -1),
    new Among("\u0117josi", 66, -1),
    new Among("uosi", 66, -1),
    new Among("iuosi", 68, -1),
    new Among("siuosi", 69, -1),
    new Among("usi", 55, -1),
    new Among("ausi", 71, -1),
    new Among("\u010Diausi", 72, -1),
    new Among("\u0105si", 55, -1),
    new Among("\u0117si", 55, -1),
    new Among("\u0173si", 55, -1),
    new Among("t\u0173si", 76, -1),
    new Among("ti", 44, -1),
    new Among("enti", 78, -1),
    new Among("inti", 78, -1),
    new Among("oti", 78, -1),
    new Among("ioti", 81, -1),
    new Among("uoti", 81, -1),
    new Among("iuoti", 83, -1),
    new Among("auti", 78, -1),
    new Among("iauti", 85, -1),
    new Among("yti", 78, -1),
    new Among("\u0117ti", 78, -1),
    new Among("tel\u0117ti", 88, -1),
    new Among("in\u0117ti", 88, -1),
    new Among("ter\u0117ti", 88, -1),
    new Among("ui", 44, -1),
    new Among("iui", 92, -1),
    new Among("eniui", 93, -1),
    new Among("oj", -1, -1),
    new Among("\u0117j", -1, -1),
    new Among("k", -1, -1),
    new Among("am", -1, -1),
    new Among("iam", 98, -1),
    new Among("iem", -1, -1),
    new Among("im", -1, -1),
    new Among("sim", 101, -1),
    new Among("om", -1, -1),
    new Among("tum", -1, -1),
    new Among("\u0117m", -1, -1),
    new Among("tum\u0117m", 105, -1),
    new Among("an", -1, -1),
    new Among("on", -1, -1),
    new Among("ion", 108, -1),
    new Among("un", -1, -1),
    new Among("iun", 110, -1),
    new Among("\u0117n", -1, -1),
    new Among("o", -1, -1),
    new Among("io", 113, -1),
    new Among("enio", 114, -1),
    new Among("\u0117jo", 113, -1),
    new Among("uo", 113, -1),
    new Among("s", -1, -1),
    new Among("as", 118, -1),
    new Among("ias", 119, -1),
    new Among("es", 118, -1),
    new Among("ies", 121, -1),
    new Among("is", 118, -1),
    new Among("ais", 123, -1),
    new Among("iais", 124, -1),
    new Among("tumeis", 123, -1),
    new Among("imis", 123, -1),
    new Among("enimis", 127, -1),
    new Among("omis", 123, -1),
    new Among("iomis", 129, -1),
    new Among("umis", 123, -1),
    new Among("\u0117mis", 123, -1),
    new Among("enis", 123, -1),
    new Among("asis", 123, -1),
    new Among("ysis", 123, -1),
    new Among("ams", 118, -1),
    new Among("iams", 136, -1),
    new Among("iems", 118, -1),
    new Among("ims", 118, -1),
    new Among("enims", 139, -1),
    new Among("erims", 139, -1),
    new Among("oms", 118, -1),
    new Among("ioms", 142, -1),
    new Among("ums", 118, -1),
    new Among("\u0117ms", 118, -1),
    new Among("ens", 118, -1),
    new Among("os", 118, -1),
    new Among("ios", 147, -1),
    new Among("uos", 147, -1),
    new Among("iuos", 149, -1),
    new Among("ers", 118, -1),
    new Among("us", 118, -1),
    new Among("aus", 152, -1),
    new Among("iaus", 153, -1),
    new Among("ius", 152, -1),
    new Among("ys", 118, -1),
    new Among("enys", 156, -1),
    new Among("erys", 156, -1),
    new Among("\u0105s", 118, -1),
    new Among("i\u0105s", 159, -1),
    new Among("\u0117s", 118, -1),
    new Among("am\u0117s", 161, -1),
    new Among("iam\u0117s", 162, -1),
    new Among("im\u0117s", 161, -1),
    new Among("kim\u0117s", 164, -1),
    new Among("sim\u0117s", 164, -1),
    new Among("om\u0117s", 161, -1),
    new Among("\u0117m\u0117s", 161, -1),
    new Among("tum\u0117m\u0117s", 168, -1),
    new Among("at\u0117s", 161, -1),
    new Among("iat\u0117s", 170, -1),
    new Among("sit\u0117s", 161, -1),
    new Among("ot\u0117s", 161, -1),
    new Among("\u0117t\u0117s", 161, -1),
    new Among("tum\u0117t\u0117s", 174, -1),
    new Among("\u012Fs", 118, -1),
    new Among("\u016Bs", 118, -1),
    new Among("t\u0173s", 118, -1),
    new Among("at", -1, -1),
    new Among("iat", 179, -1),
    new Among("it", -1, -1),
    new Among("sit", 181, -1),
    new Among("ot", -1, -1),
    new Among("\u0117t", -1, -1),
    new Among("tum\u0117t", 184, -1),
    new Among("u", -1, -1),
    new Among("au", 186, -1),
    new Among("iau", 187, -1),
    new Among("\u010Diau", 188, -1),
    new Among("iu", 186, -1),
    new Among("eniu", 190, -1),
    new Among("siu", 190, -1),
    new Among("y", -1, -1),
    new Among("\u0105", -1, -1),
    new Among("i\u0105", 194, -1),
    new Among("\u0117", -1, -1),
    new Among("\u0119", -1, -1),
    new Among("\u012F", -1, -1),
    new Among("en\u012F", 198, -1),
    new Among("er\u012F", 198, -1),
    new Among("\u0173", -1, -1),
    new Among("i\u0173", 201, -1),
    new Among("er\u0173", 201, -1)
};

private final static Among a_1[] = {
    new Among("ing", -1, -1),
    new Among("aj", -1, -1),
    new Among("iaj", 1, -1),
    new Among("iej", -1, -1),
    new Among("oj", -1, -1),
    new Among("ioj", 4, -1),
    new Among("uoj", 4, -1),
    new Among("iuoj", 6, -1),
    new Among("auj", -1, -1),
    new Among("\u0105j", -1, -1),
    new Among("i\u0105j", 9, -1),
    new Among("\u0117j", -1, -1),
    new Among("\u0173j", -1, -1),
    new Among("i\u0173j", 12, -1),
    new Among("ok", -1, -1),
    new Among("iok", 14, -1),
    new Among("iuk", -1, -1),
    new Among("uliuk", 16, -1),
    new Among("u\u010Diuk", 16, -1),
    new Among("i\u0161k", -1, -1),
    new Among("iul", -1, -1),
    new Among("yl", -1, -1),
    new Among("\u0117l", -1, -1),
    new Among("am", -1, -1),
    new Among("dam", 23, -1),
    new Among("jam", 23, -1),
    new Among("zgan", -1, -1),
    new Among("ain", -1, -1),
    new Among("esn", -1, -1),
    new Among("op", -1, -1),
    new Among("iop", 29, -1),
    new Among("ias", -1, -1),
    new Among("ies", -1, -1),
    new Among("ais", -1, -1),
    new Among("iais", 33, -1),
    new Among("os", -1, -1),
    new Among("ios", 35, -1),
    new Among("uos", 35, -1),
    new Among("iuos", 37, -1),
    new Among("aus", -1, -1),
    new Among("iaus", 39, -1),
    new Among("\u0105s", -1, -1),
    new Among("i\u0105s", 41, -1),
    new Among("\u0119s", -1, -1),
    new Among("ut\u0117ait", -1, -1),
    new Among("ant", -1, -1),
    new Among("iant", 45, -1),
    new Among("siant", 46, -1),
    new Among("int", -1, -1),
    new Among("ot", -1, -1),
    new Among("uot", 49, -1),
    new Among("iuot", 50, -1),
    new Among("yt", -1, -1),
    new Among("\u0117t", -1, -1),
    new Among("yk\u0161t", -1, -1),
    new Among("iau", -1, -1),
    new Among("dav", -1, -1),
    new Among("sv", -1, -1),
    new Among("\u0161v", -1, -1),
    new Among("yk\u0161\u010D", -1, -1),
    new Among("\u0119", -1, -1),
    new Among("\u0117j\u0119", 60, -1)
};

private final static Among a_2[] = {
    new Among("ojime", -1, 7),
    new Among("\u0117jime", -1, 3),
    new Among("avime", -1, 6),
    new Among("okate", -1, 8),
    new Among("aite", -1, 1),
    new Among("uote", -1, 2),
    new Among("asius", -1, 5),
    new Among("okat\u0117s", -1, 8),
    new Among("ait\u0117s", -1, 1),
    new Among("uot\u0117s", -1, 2),
    new Among("esiu", -1, 4)
};

private final static Among a_3[] = {
    new Among("\u010D", -1, 1),
    new Among("d\u017E", -1, 2)
};

private final static Among a_4[] = {
    new Among("gd", -1, 1)
};

private static final char g_v[] = {17, 65, 16, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 0, 64, 1, 0, 64, 0, 0, 0, 0, 0, 0, 0, 4, 4 };

private int I_p1;


private boolean r_R1() {
    if (!(I_p1 <= cursor))
    {
        return false;
    }
    return true;
}

private boolean r_step1() {
    // (, line 44
    // setlimit, line 45
    if (cursor < I_p1)
    {
        return false;
    }
    int v_2 = limit_backward;
    limit_backward = I_p1;
    // (, line 45
    // [, line 45
    ket = cursor;
    // substring, line 45
    if (find_among_b(a_0) == 0)
    {
        limit_backward = v_2;
        return false;
    }
    // ], line 45
    bra = cursor;
    limit_backward = v_2;
    // call R1, line 45
    if (!r_R1())
    {
        return false;
    }
    // delete, line 229
    slice_del();
    return true;
}

private boolean r_step2() {
    // repeat, line 232
    while(true)
    {
        int v_1 = limit - cursor;
        lab0: {
            // (, line 232
            // setlimit, line 233
            if (cursor < I_p1)
            {
                break lab0;
            }
            int v_3 = limit_backward;
            limit_backward = I_p1;
            // (, line 233
            // [, line 233
            ket = cursor;
            // substring, line 233
            if (find_among_b(a_1) == 0)
            {
                limit_backward = v_3;
                break lab0;
            }
            // ], line 233
            bra = cursor;
            limit_backward = v_3;
            // delete, line 303
            slice_del();
            continue;
        }
        cursor = limit - v_1;
        break;
    }
    return true;
}

private boolean r_fix_conflicts() {
    int among_var;
    // (, line 306
    // [, line 307
    ket = cursor;
    // substring, line 307
    among_var = find_among_b(a_2);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 307
    bra = cursor;
    switch (among_var) {
        case 1:
            // (, line 309
            // <-, line 309
            slice_from("ait\u0117");
            break;
        case 2:
            // (, line 314
            // <-, line 314
            slice_from("uot\u0117");
            break;
        case 3:
            // (, line 319
            // <-, line 319
            slice_from("\u0117jimas");
            break;
        case 4:
            // (, line 322
            // <-, line 322
            slice_from("esys");
            break;
        case 5:
            // (, line 324
            // <-, line 324
            slice_from("asys");
            break;
        case 6:
            // (, line 327
            // <-, line 327
            slice_from("avimas");
            break;
        case 7:
            // (, line 328
            // <-, line 328
            slice_from("ojimas");
            break;
        case 8:
            // (, line 331
            // <-, line 331
            slice_from("okat\u0117");
            break;
    }
    return true;
}

private boolean r_fix_chdz() {
    int among_var;
    // (, line 337
    // [, line 338
    ket = cursor;
    // substring, line 338
    among_var = find_among_b(a_3);
    if (among_var == 0)
    {
        return false;
    }
    // ], line 338
    bra = cursor;
    switch (among_var) {
        case 1:
            // (, line 339
            // <-, line 339
            slice_from("t");
            break;
        case 2:
            // (, line 340
            // <-, line 340
            slice_from("d");
            break;
    }
    return true;
}

private boolean r_fix_gd() {
    // (, line 344
    // [, line 345
    ket = cursor;
    // substring, line 345
    if (find_among_b(a_4) == 0)
    {
        return false;
    }
    // ], line 345
    bra = cursor;
    // (, line 346
    // <-, line 346
    slice_from("g");
    return true;
}

public boolean stem() {
    // (, line 353
    I_p1 = limit;
    // do, line 357
    int v_1 = cursor;
    lab0: {
        // (, line 357
        // try, line 359
        int v_2 = cursor;
        lab1: {
            // (, line 359
            // test, line 359
            int v_3 = cursor;
            // literal, line 359
            if (!(eq_s("a")))
            {
                cursor = v_2;
                break lab1;
            }
            cursor = v_3;
            if (!(current.length() > 6))
            {
                cursor = v_2;
                break lab1;
            }
            // hop, line 359
            {
                int c = cursor + 1;
                if (0 > c || c > limit)
                {
                    cursor = v_2;
                    break lab1;
                }
                cursor = c;
            }
        }
        // gopast, line 361
        golab2: while(true)
        {
            lab3: {
                if (!(in_grouping(g_v, 97, 371)))
                {
                    break lab3;
                }
                break golab2;
            }
            if (cursor >= limit)
            {
                break lab0;
            }
            cursor++;
        }
        // gopast, line 361
        golab4: while(true)
        {
            lab5: {
                if (!(out_grouping(g_v, 97, 371)))
                {
                    break lab5;
                }
                break golab4;
            }
            if (cursor >= limit)
            {
                break lab0;
            }
            cursor++;
        }
        // setmark p1, line 361
        I_p1 = cursor;
    }
    cursor = v_1;
    // backwards, line 364
    limit_backward = cursor;
    cursor = limit;
    // (, line 364
    // do, line 365
    int v_6 = limit - cursor;
    // call fix_conflicts, line 365
    r_fix_conflicts();
    cursor = limit - v_6;
    // do, line 366
    int v_7 = limit - cursor;
    // call step1, line 366
    r_step1();
    cursor = limit - v_7;
    // do, line 367
    int v_8 = limit - cursor;
    // call fix_chdz, line 367
    r_fix_chdz();
    cursor = limit - v_8;
    // do, line 368
    int v_9 = limit - cursor;
    // call step2, line 368
    r_step2();
    cursor = limit - v_9;
    // do, line 369
    int v_10 = limit - cursor;
    // call fix_chdz, line 369
    r_fix_chdz();
    cursor = limit - v_10;
    // do, line 370
    int v_11 = limit - cursor;
    // call fix_gd, line 370
    r_fix_gd();
    cursor = limit - v_11;
    cursor = limit_backward;
    return true;
}

@Override
public boolean equals( Object o ) {
    return o instanceof lithuanianStemmer;
}

@Override
public int hashCode() {
    return lithuanianStemmer.class.getName().hashCode();
}



}
