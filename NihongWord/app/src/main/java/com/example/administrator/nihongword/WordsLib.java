package com.example.administrator.nihongword;

import java.util.ArrayList;

/**
 * Created by WangZeshuang on 2016/12/20.
 */

public class WordsLib {

    public static ArrayList<Word> getFirstWords() {
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("わたし", "", "我"));
        list.add(new Word("わたしたち", "", "我們"));
        list.add(new Word("あなた", "", "你，妳"));
        list.add(new Word("あの ひと", "あの 人", "他，她，那個人"));
        list.add(new Word("みなさん", "皆さん", "各位，大家 "));
        list.add(new Word("～さん", "", "~先生,~小姐,~女士"));
        list.add(new Word("～ちゃん", "", "（用於小孩的名字後）"));
        list.add(new Word("～くん", "～君", "～君（用於男孩的名字後）"));
        list.add(new Word("～じん", "～人", "表國籍,如アメリカじん"));
        list.add(new Word("せんせい", "先生", "老師，教導者"));
        list.add(new Word("きょうし", "教師", "教師"));
        list.add(new Word("がくせい", "学生", "學生"));
        list.add(new Word("かいしゃいん", "会社員", "公司職員"));
        list.add(new Word("しゃいん ", "社員", "~公司的職員"));
        list.add(new Word("ぎんこういん", "銀行員", "銀行員"));
        list.add(new Word("いしゃ", "医者", "醫生"));
        list.add(new Word("けんきゅうしゃ", "研究者", "研究人員"));
        list.add(new Word("エンジニア", "", "工程師"));
        list.add(new Word("だいがく", "大学", "大學"));
        list.add(new Word("びょういん", "病院", "醫院"));
        list.add(new Word("でんき", "電気", "電，電燈"));
        list.add(new Word("だれ（どなた）", "", "誰（哪位）"));
        list.add(new Word("…さい", "…歳", "…歲"));
        list.add(new Word("なんさい", "何歳", "幾歲"));
        list.add(new Word("はい", "", "是，對"));
        list.add(new Word("いいえ", "", "不，不是"));
//        list.add(new Word("","",""));
        return list;
    }

    public static ArrayList<Word> getSecondWords() {
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("これ", "", "這（事物近己方）"));
        list.add(new Word("それ", "", "那（事物近對方）"));
        list.add(new Word("あれ", "", "那（事物在遠方）"));
        list.add(new Word("この～", "", "這（近己方）"));
        list.add(new Word("その～", "", "那（近對方）"));
        list.add(new Word("あの～", "", "那（遠方）"));
        list.add(new Word("ほん", "本", "書本，書籍"));
        list.add(new Word("じしょ", "辞書", "辭典"));
        list.add(new Word("ざっし", "雑誌", "雜誌"));
        list.add(new Word("しんぶん", "新聞", "報紙"));
        list.add(new Word("ノート", "", "筆記本"));
        list.add(new Word("てちょう", "手帳", "記事本"));
        list.add(new Word("めいし", "名刺", "名片"));
        list.add(new Word("カード", "", "卡片"));
        list.add(new Word("テレホンカード", "", "電話卡"));
        list.add(new Word("えんぴつ", "鉛筆", "鉛筆"));
        list.add(new Word("ボールペン", "", "原子筆"));
        list.add(new Word("シャープペンシル", "", "自動鉛筆"));
        list.add(new Word("かぎ", "", "鑰匙"));
        list.add(new Word("とけい", "時計", "鐘錶"));
        list.add(new Word("かさ", "傘", "傘"));
        list.add(new Word("かばん", "", "書包，手提包，皮包"));
        list.add(new Word("［カセット］テープ", "", "錄音帶"));
        list.add(new Word("テープレコーダー", "", "錄音機"));
        list.add(new Word("テレビ", "", "電視"));
        list.add(new Word("ラジオ", "", "收音機"));
        list.add(new Word("カメラ", "", "照相機"));
        list.add(new Word("コンピューター", "", "電腦"));
        list.add(new Word("じどうしゃ", "自動車", "汽車"));
        list.add(new Word("つくえ", "机", "桌子"));
        list.add(new Word("いす", "", "椅子"));
        list.add(new Word("チョコレート", "", "巧克力"));
        list.add(new Word("コーヒー", "", "咖啡"));
        list.add(new Word("えいご", "英語", "英語"));
        list.add(new Word("にほんご", "日本語", "日語"));
        list.add(new Word("～ご", "～語", "～語"));
        list.add(new Word("なん", "何", "什麼"));
        list.add(new Word("そう", "", "是的"));
        list.add(new Word("ちがいます", "違います", "不對/不是"));
        list.add(new Word("そうですか", "", "我了解了/是嗎？"));
        list.add(new Word("あのう", "", "嗯(用於表示躊躇)"));
        list.add(new Word("どうぞ", "", "請/給你"));
        list.add(new Word("どうも", "", "謝了"));
        list.add(new Word("［どうも］ ありがとう ［ございます］。", "", "(非常)謝謝你"));
        return list;
    }

    public static ArrayList<Word> getThirdWords() {
        ArrayList<Word> list = new ArrayList<>();

        list.add(new Word("ここ", "", "這裡，這個地方"));
        list.add(new Word("そこ", "", "那裡，那個地方"));
        list.add(new Word("あそこ", "", "那裡，那個地方"));
        list.add(new Word("どこ", "", "哪裡，哪個地方"));
        list.add(new Word("こちら", "", "這邊,ここ的禮貌形"));
        list.add(new Word("そちら", "", "那邊,そこ的禮貌形"));
        list.add(new Word("あちら", "", "那邊,あそこ的禮貌形"));
        list.add(new Word("どちら", "", "哪邊,どこ的禮貌形"));
        list.add(new Word("きょうしつ", "教室", "教室"));
        list.add(new Word("しょくどう", "食堂", "餐廳，食堂"));
        list.add(new Word("じむしょ", "事務所", "辦公室"));
        list.add(new Word("かいぎしつ", "会議室", "會議室"));
        list.add(new Word("うけつけ", "受付", "傳達室，接待"));
        list.add(new Word("ロビー", "", "大廳，休息室"));
        list.add(new Word("へや", "部屋", "房間"));
        list.add(new Word("トイレ(おてあらい)", "お手洗い", "廁所（洗手間）"));
        list.add(new Word("かいだん", "階段", "樓梯"));
        list.add(new Word("エレベーター", "", "電梯"));
        list.add(new Word("エスカレーター", "", "電扶梯"));
        list.add(new Word("［お］くに ", "［お］国", "貴國"));
        list.add(new Word("かいしゃ", "会社", "公司"));
        list.add(new Word("うち", "", "家，房子"));
        list.add(new Word("でんわ", "電話", "電話，電話呼叫"));
        list.add(new Word("くつ", "靴", "鞋子"));
        list.add(new Word("ネクタイ", "", "領帶"));
        list.add(new Word("ワイン", "", "葡萄酒"));
        list.add(new Word("たばこ", "", "香煙"));
        list.add(new Word("うりば", "売り場", "櫃台，賣場"));
        list.add(new Word("ちか", "地下", "地下"));
        list.add(new Word("…かい（ …がい ）", "…階", "⋯樓"));
        list.add(new Word("なんがい", "何階", "幾樓"));
        list.add(new Word("…えん", "…円", "⋯日元"));
        list.add(new Word("いくら", "", "多少錢"));
        list.add(new Word("ひゃく", "百", "百"));
        list.add(new Word("せん", "千", "千"));
        list.add(new Word("まん", "万", "万"));
        list.add(new Word("すみません", "", "對不起，請問"));
        list.add(new Word("～で ございます", "", "です的禮貌形"));
        list.add(new Word("「～を」見せて ください", "", "請讓我看一下~"));
        list.add(new Word("じゃ", "", "那麼"));
        list.add(new Word("「～を」ください", "", "請給我~"));

        return list;
    }

    public static ArrayList<Word> getFourthWords() {
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("おきます", "起きます", "起床，起來"));
        list.add(new Word("ねます", "寝ます", "睡覺，就寢"));
        list.add(new Word("はたらきます", "働きます", "工作"));
        list.add(new Word("やすみます", "休みます", "休息"));
        list.add(new Word("べんきょうします", "勉強します", "念書，用功"));
        list.add(new Word("おわります", "終わります", "結束"));
        list.add(new Word("デパート", "", "百貨公司"));
        list.add(new Word("ぎんこう", "銀行", "銀行"));
        list.add(new Word("ゆうびんきょく", "郵便局", "郵局"));
        list.add(new Word("としょかん", "図書館", "圖書館"));
        list.add(new Word("びじゅつかん", "美術館", "美術館"));
        list.add(new Word("いま", "今", "現在"));
        list.add(new Word("…じ", "…時", "…點（鐘）"));
        list.add(new Word("…ふん", "…分", "…分（鐘）"));
        list.add(new Word("はん", "半", "半"));
        list.add(new Word("なんじ", "何時", "幾點"));
        list.add(new Word("なんぷん", "何分", "幾分"));
        list.add(new Word("ごぜん", "午前", "上午"));
        list.add(new Word("ごご", "午後", "下午"));
        list.add(new Word("あさ", "朝", "早上"));
        list.add(new Word("ひる", "昼", "白天，中午"));
        list.add(new Word("ばん(よる)", "晩(夜)", "晚上，夜晚"));
        list.add(new Word("おととい", "", "前天"));
        list.add(new Word("きのう", "", "昨天"));
        list.add(new Word("きょう", "", "今天"));
        list.add(new Word("あした", "", "明天"));
        list.add(new Word("あさって", "", "後天"));
        list.add(new Word("けさ", "", "今天早上"));
        list.add(new Word("こんばん", "今晩", "今天晚上"));
        list.add(new Word("やすみ", "休み", "休息，休假"));
        list.add(new Word("ひるやすみ", "昼休み", "午休"));
        list.add(new Word("まいあさ", "毎朝", "每天早上"));
        list.add(new Word("まいばん", "毎晩", "每天晚上"));
        list.add(new Word("まいにち", "毎日", "每天"));
        list.add(new Word("げつようび", "月曜日", "星期一"));
        list.add(new Word("かようび", "火曜日", "星期二"));
        list.add(new Word("すいようび", "水曜日", "星期三"));
        list.add(new Word("もくようび", "木曜日", "星期四"));
        list.add(new Word("きんようび", "金曜日", "星期五"));
        list.add(new Word("どようび", "土曜日", "星期六"));
        list.add(new Word("にちようび", "日曜日", "星期日"));
        list.add(new Word("なんようび", "何曜日", "星期几"));
        list.add(new Word("ばんごう", "番号", "號碼"));
        list.add(new Word("なんばん", "何番", "幾號"));
        list.add(new Word("～から", "", "從~"));
        list.add(new Word("～まで", "", "到~"));
        list.add(new Word("～と～", "", "和（用於連接名詞）"));
        list.add(new Word("そちら", "", "貴，你們"));
        list.add(new Word("たいへんですね", "大変ですね", "夠嗆、不得了"));
        list.add(new Word("え―と", "", "嗯，我看看"));

        return list;
    }

    public static ArrayList<Word> getFifthWords() {
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("いきます","行きます","去"));
        list.add(new Word("きます","来ます","來"));
        list.add(new Word("かえります","帰ります","回家，回去"));
        list.add(new Word("がっこう","学校","學校"));
        list.add(new Word("スーパー","","超級市場"));
        list.add(new Word("えき","駅","火車站"));
        list.add(new Word("ひこうき","飛行機","飛機"));
        list.add(new Word("ふね","船","船"));
        list.add(new Word("でんしゃ","電車","電車"));
        list.add(new Word("ちかてつ","地下鉄","地下鐵"));
        list.add(new Word("しんかんせん","新幹線","新幹線"));
        list.add(new Word("バス","","公車，巴士"));
        list.add(new Word("タクシー","","計程車"));
        list.add(new Word("じてんしゃ","自転車","自行車，腳踏車"));
        list.add(new Word("あるいて","歩いて","步行"));
        list.add(new Word("ひと","人","人"));
        list.add(new Word("ともだち","友達","朋友"));
        list.add(new Word("かれ","彼","他，男朋友，情人"));
        list.add(new Word("かのじょ","彼女","她，女朋友，情人"));
        list.add(new Word("かぞく","家族","家人，家屬"));
        list.add(new Word("ひとりで","一人で","一個人，獨自"));
        list.add(new Word("せんしゅう","先週","上週，上星期"));
        list.add(new Word("こんしゅう","今週","本週，這星期"));
        list.add(new Word("らいしゅう","来週","下週，下星期"));
        list.add(new Word("せんげつ","先月","上個月"));
        list.add(new Word("こんげつ","今月","這個月"));
        list.add(new Word("らいげつ","来月","下個月"));
        list.add(new Word("きょねん","去年","去年"));
        list.add(new Word("ことし","","今年"));
        list.add(new Word("らいねん","来年","明年"));
        list.add(new Word("…がつ","…月","…月"));
        list.add(new Word("なんがつ","何月","幾月"));
        list.add(new Word("ついたち","1日","1日，1号"));
        list.add(new Word("ふつか","2日","2日，2号"));
        list.add(new Word("みっか","3日","3日，3号"));
        list.add(new Word("よっか","4日","4日，4号"));
        list.add(new Word("いつか","5日","5日，5号"));
        list.add(new Word("むいか","6日","6日，6号"));
        list.add(new Word("なのか","7日","7日，7号"));
        list.add(new Word("ようか","8日","8日，8号"));
        list.add(new Word("ここのか","9日","9日，9号"));
        list.add(new Word("とおか","10日","10日，10号"));
        list.add(new Word("じゅうよっか","14日","14日，14号"));
        list.add(new Word("はつか","20日","20日，20号"));
        list.add(new Word("にじゅうよっか","24日","24日，24号"));
        list.add(new Word("…にち","…日","…日，…号"));
        list.add(new Word("なんにち","何日","幾日，幾號"));
        list.add(new Word("いつ","","什麼時候"));
        list.add(new Word("たんじょうび","誕生日","生日"));
        list.add(new Word("ふつう","普通","普通車"));
        list.add(new Word("きゅうこう","急行","快車"));
        list.add(new Word("とっきゅう","特急","特快車"));
        list.add(new Word("つぎの","次の","下一個，下一次"));
        list.add(new Word("どう いたしまして","","不客氣/哪裡哪裡"));
        list.add(new Word("…番線","","第...月台"));

        return list;
    }
    public static ArrayList<Word> getSixthWords(){
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("たべます","食べます","吃"));
        list.add(new Word("のみます","飲みます","喝，飲，服用"));
        list.add(new Word("すいます","吸います","吸[煙]"));
        list.add(new Word("みます","見ます","看"));
        list.add(new Word("ききます","聞きます","聽"));
        list.add(new Word("よみます","読みます","閱讀"));
        list.add(new Word("かきます","書きます","書寫"));
        list.add(new Word("かいます","買います","購買"));
        list.add(new Word("とります","撮ります","拍[照] ，攝[影]"));
        list.add(new Word("します","","做"));
        list.add(new Word("あいます","会います","遇見，碰見"));
        list.add(new Word("ごはん","","餐，米飯"));
        list.add(new Word("あさごはん","朝ごはん","早餐"));
        list.add(new Word("ひるごはん","昼ごはん","中餐"));
        list.add(new Word("ばんごはん","晩ごはん","晚餐"));
        list.add(new Word("パン","","麵包"));
        list.add(new Word("たまご","卵","雞蛋"));
        list.add(new Word("にく 肉 肉"));
        list.add(new Word("さかな 魚 魚"));
        list.add(new Word("やさい 野菜 蔬菜"));
        list.add(new Word("くだもの 果物 水果"));
        list.add(new Word("みず 水 水"));
        list.add(new Word("おちゃ お茶 茶"));
        list.add(new Word("こうちゃ 紅茶 紅茶"));
        list.add(new Word("ぎゅうにゅう 牛乳 牛奶"));
        list.add(new Word("ジュース 果汁"));
        list.add(new Word("ビール 啤酒"));
        list.add(new Word("［お］さけ ［お］酒 酒類，日本酒"));
        list.add(new Word("ビデオ 錄影帶，錄影機"));
        list.add(new Word("えいが 映画 電影"));
        list.add(new Word("てがみ 手紙 信"));
        list.add(new Word("レポート 報告"));
        list.add(new Word("しゃしん 写真 相片"));
        list.add(new Word("みせ 店 商店"));
        list.add(new Word("レストラン 餐廳"));
        list.add(new Word("にわ 庭 院子"));
        list.add(new Word("しゅくだい 宿題 作業"));
        list.add(new Word("テニス  網球"));
        list.add(new Word("サッカー 足球"));
        list.add(new Word("［お］はなみ ［お］花見 賞花"));
        list.add(new Word("なに 何 什麼"));
        list.add(new Word("いっしょに 一起"));
        list.add(new Word("ちょっと 一下子，稍"));
        list.add(new Word("いつも 總是"));
        list.add(new Word("ときどき 時々 時常，有時"));
        list.add(new Word("それから 然後"));
        list.add(new Word("ええ 是，嗯"));
        list.add(new Word("いいですね。 好呀"));
        list.add(new Word("わかりました 我明白了/我知道了"));
        list.add(new Word("何ですか 什麼事"));
        list.add(new Word("じゃ、また 那麼，明天見"));

        return list;
    }

    public static ArrayList<Word> getSeventhWords(){
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("きります 切ります 剪，切"));
        list.add(new Word("おくります 送ります 寄送"));
        list.add(new Word("あげます 給，送"));
        list.add(new Word("もらいます 接受，得到"));
        list.add(new Word("かします 貸します 借（出）"));
        list.add(new Word("かります 借ります 借（入）"));
        list.add(new Word("おしえます 教えます 教"));
        list.add(new Word("ならいます 習います 學習"));
        list.add(new Word("かけます 打【电话】"));
        list.add(new Word("て 手 手"));
        list.add(new Word("はし 筷子"));
        list.add(new Word("スプーン 湯匙"));
        list.add(new Word("ナイフ 小刀"));
        list.add(new Word("フォーク 叉子"));
        list.add(new Word("はさみ 剪刀"));
        list.add(new Word("ファクス 傳真"));
        list.add(new Word("ワープロ 文字處理機"));
        list.add(new Word("パソコン 個人電腦"));
        list.add(new Word("パンチ 打孔機"));
        list.add(new Word("ホッチキス 釘書機"));
        list.add(new Word("セロテープ 透明膠帶"));
        list.add(new Word("けしゴム 消しゴム 橡皮擦"));
        list.add(new Word("かみ 紙 紙"));
        list.add(new Word("はな 花 花"));
        list.add(new Word("シャツ 襯衫"));
        list.add(new Word("プレゼント 禮物"));
        list.add(new Word("にもつ 荷物 行李"));
        list.add(new Word("おかね お金 錢"));
        list.add(new Word("きっぷ 切符 票 "));
        list.add(new Word("クリスマス 聖誕節"));
        list.add(new Word("ちち 父 家父"));
        list.add(new Word("はは 母 家母"));
        list.add(new Word("おとうさん お父さん （他人的）父親 "));
        list.add(new Word("おかあさん お母さん （他人的）母親"));
        list.add(new Word("もう 已經"));
        list.add(new Word("おとうさん お父さん （他人的）父親"));
        list.add(new Word("おかあさん お母さん （他人的）母親"));
        list.add(new Word("もう 已經"));
        list.add(new Word("まだ 尚未，還沒有"));
        list.add(new Word("これから 從現在起，這就"));
        list.add(new Word("「～、」すてきですね。 〔～〕，好棒喲！"));
        list.add(new Word("ごめんください。 對不起／有人在家嗎"));
        list.add(new Word("いらっしゃい。 歡迎"));
        list.add(new Word("失礼します。 對不起"));
        list.add(new Word("いただきます。 謝謝"));

        return list;
    }

    public static ArrayList<Word> getEighthWords(){
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("ハンサム［な］ 英俊"));
        list.add(new Word("きれい［な］ 美麗"));
        list.add(new Word("しずか［な］ 静か［な］ 安靜"));
        list.add(new Word("にぎやか［な］ 熱鬧"));
        list.add(new Word("ゆうめい［な］ 有名［な］ 有名"));
        list.add(new Word("しんせつ［な］ 親切［な］ 親切"));
        list.add(new Word("げんき［な］ 元気［な］ 身體好"));
        list.add(new Word("ひま［な］ 暇［な］ 空閒"));
        list.add(new Word("べんり［な］ 便利［な］ 方便"));
        list.add(new Word("すてき［な］ 很好"));
        list.add(new Word("おおきい 大きい 大 "));
        list.add(new Word("ちいさい 小さい 小 "));
        list.add(new Word("あたらしい 新しい 新"));
        list.add(new Word("ふるい 古い 舊"));
        list.add(new Word("いい（よい） 好"));
        list.add(new Word("わるい 悪い 壞 "));
        list.add(new Word("あつい 暑い、熱い 熱"));
        list.add(new Word("さむい 寒い 寒冷"));
        list.add(new Word("つめたい 冷たい 涼"));
        list.add(new Word("むずかしい 難しい 難"));
        list.add(new Word("やさしい 易しい 簡單"));
        list.add(new Word("たかい 高い 高，貴"));
        list.add(new Word("やすい 安い 便宜"));
        list.add(new Word("ひくい 低い 低，矮"));
        list.add(new Word("おもしろい 有趣，有意思"));
        list.add(new Word("おいしい 美味，好吃"));
        list.add(new Word("いそがしい 忙しい 忙祿"));
        list.add(new Word("たのしい 楽しい 愉快，高興"));
        list.add(new Word("しろい 白い 白色的"));
        list.add(new Word("くろい 黒い 黑色的"));
        list.add(new Word("あかい 赤い 紅色的"));
        list.add(new Word("あおい 青い 藍色的"));
        list.add(new Word("さくら 桜 櫻花"));
        list.add(new Word("やま 山 山"));
        list.add(new Word("まち 町 城市，城鎮"));
        list.add(new Word("たべもの 食べ物 食物"));
        list.add(new Word("くるま 車 汽車 "));
        list.add(new Word("ところ 所 場所，地方"));
        list.add(new Word("りょう 寮 宿舍"));
        list.add(new Word("べんきょう 勉強 學習，用功"));
        list.add(new Word("せいかつ 生活 生活"));
        list.add(new Word("［お］しごと ［お］仕事 工作，職業"));
        list.add(new Word("どう 怎麼樣"));
        list.add(new Word("どんな～  什麼樣的～"));
        list.add(new Word("どれ 哪個"));
        list.add(new Word("とても 很，非常"));
        list.add(new Word("あまり 不太"));
        list.add(new Word("そして 而且，還用"));
        list.add(new Word("おげんきですか。 お元気ですか。 你好嗎？"));
        list.add(new Word("そうですね。 是呀"));

        return list;
    }
    public static ArrayList<Word> getNinthWords(){
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("わかります 了解，明白，懂 "));
        list.add(new Word("あります 有"));
        list.add(new Word("すき［な］ 好き［な］ 喜歡,愛好"));
        list.add(new Word("きらい［な］ 嫌い［な］ 討厭,不喜歡"));
        list.add(new Word("じょうず［な］ 上手［な］ 好,高明"));
        list.add(new Word("へた［な］ 下手［な］ 不行的,笨拙"));
        list.add(new Word("りょうり 料理 料理，菜"));
        list.add(new Word("のみもの 飲み物 飲料"));
        list.add(new Word("スポーツ  運動，體育"));
        list.add(new Word("やきゅう 野球 棒球"));
        list.add(new Word("ダンス 跳舞，舞蹈"));
        list.add(new Word("おんがく 音楽 音樂"));
        list.add(new Word("うた 歌 歌曲，歌"));
        list.add(new Word("クラシック 古典音樂"));
        list.add(new Word("ジャズ 爵士樂"));
        list.add(new Word("コンサート 音樂會，演奏會"));
        list.add(new Word("カラオケ 卡拉Ok"));
        list.add(new Word("かぶき 歌舞伎 歌舞伎"));
        list.add(new Word("え 絵 畫 "));
        list.add(new Word("じ 字 字"));
        list.add(new Word("かんじ 漢字 漢字"));
        list.add(new Word("ひらがな 平假名"));
        list.add(new Word("かたかな 片假名"));
        list.add(new Word("ローマじ ローマ字 羅馬拼音"));
        list.add(new Word("こまかいおかね 細かいお金 零錢 "));
        list.add(new Word("チケット 票"));
        list.add(new Word("じかん 時間 時間"));
        list.add(new Word("ようじ 用事 （必須辦的）事情，工作"));
        list.add(new Word("やくそく 約束 約定，承諾 "));
        list.add(new Word("ごしゅじん ご主人 （他人的）丈夫"));
        list.add(new Word("おっと／しゅじん 夫／主人 （自己的）丈夫"));
        list.add(new Word("おくさん 奥さん （他人的）妻子"));
        list.add(new Word("つま／かない 妻／家内 （自己的）妻子"));
        list.add(new Word("こども 子ども 小孩"));
        list.add(new Word("よく 很，十分"));
        list.add(new Word("だいたい 大致，大概"));
        list.add(new Word("たくさん 很多"));
        list.add(new Word("すこし 少し 少，稍微"));
        list.add(new Word("ぜんぜん 全然 完全，一點也"));
        list.add(new Word("はやく 早く、速く 早些，快些"));
        list.add(new Word("～から 因为～"));
        list.add(new Word("どうして 為什麼"));
        list.add(new Word("ざんねんです［ね］。 残念です［ね］ 真遺憾"));
        list.add(new Word("すみません。 很抱歉"));
        list.add(new Word("もしもし 喂"));
        list.add(new Word("ああ 啊"));
        list.add(new Word("だめですか。 不行嗎"));

        return list;
    }
    public static ArrayList<Word> getTenthWords(){
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("います 有，在（表示生物的存在）"));
        list.add(new Word("あります 有，在（表示無生物的存在）"));
        list.add(new Word("いろいろ〔な〕 各式各樣"));
        list.add(new Word("おとこのひと 男の人 男子"));
        list.add(new Word("おんなのひと 女の人 女子"));
        list.add(new Word("おとこのこ 男の子 男孩"));
        list.add(new Word("おんなのこ 女の子 女孩"));
        list.add(new Word("いぬ 犬 狗"));
        list.add(new Word("ねこ 猫 貓"));
        list.add(new Word("き 木 樹，木頭"));
        list.add(new Word("もの 物 物品，東西"));
        list.add(new Word("フィルム 底片，膠卷"));
        list.add(new Word("でんち 電池 電池"));
        list.add(new Word("はこ 箱 盒子"));
        list.add(new Word("スイッチ 開關"));
        list.add(new Word("れいぞうこ 冷蔵庫 冰箱"));
        list.add(new Word("テーブル 餐桌"));
        list.add(new Word("べッド 床"));
        list.add(new Word("たな 棚 架子"));
        list.add(new Word("ドア 門"));
        list.add(new Word("まど 窓 窗戶"));
        list.add(new Word("ポスト 郵筒，信箱"));
        list.add(new Word("ビル 大廈，大樓"));
        list.add(new Word("こうえん 公園 公園"));
        list.add(new Word("きっさてん 喫茶店 咖啡館"));
        list.add(new Word("ほんや 本屋 書店"));
        list.add(new Word("～や ～屋 ～店"));
        list.add(new Word("のりば 乗り場 搭乘火車、計程車等交通工具的場所"));
        list.add(new Word("けん 県 縣 "));
        list.add(new Word("うえ 上 上，上面"));
        list.add(new Word("した 下 下，下面"));
        list.add(new Word("まえ 前 前，前面"));
        list.add(new Word("うしろ 後，後面"));
        list.add(new Word("みぎ 右 右（邊）"));
        list.add(new Word("ひだり 左 左（邊）"));
        list.add(new Word("なか 中 裡面，中間 "));
        list.add(new Word("そと 外 外面"));
        list.add(new Word("となり 隣 隔壁，旁邊"));
        list.add(new Word("ちかく 近く 附近"));
        list.add(new Word("あいだ 間 之間，中間"));
        list.add(new Word("いちばん～ 最～"));
        list.add(new Word("…だんめ …段目 第...層"));
        list.add(new Word("〔どうも〕すみません。 謝謝"));
        list.add(new Word("チリソース 辣醬"));

        return list;
    }
    public static ArrayList<Word> getEleventhWords(){
        ArrayList<Word> list = new ArrayList<>();
        list.add(new Word("います 有"));
        list.add(new Word("います 在"));
        list.add(new Word("かかります 花費"));
        list.add(new Word("ひとつ 1つ 一個"));
        list.add(new Word("ふたつ 2つ 二個"));
        list.add(new Word("みっつ 3つ 三個"));
        list.add(new Word("よっつ 4つ 四個"));
        list.add(new Word("いつつ 5つ 五個"));
        list.add(new Word("むっつ 6つ 六個"));
        list.add(new Word("ななつ 7つ 七個"));
        list.add(new Word("やっつ 8つ 八個"));
        list.add(new Word("ここのつ 9つ 九個"));
        list.add(new Word("とお 10つ 十個"));
        list.add(new Word("いくつ 幾個"));
        list.add(new Word("ひとり 1人 一個人"));
        list.add(new Word("ふたり 2人 二個人"));
        list.add(new Word("…にん …人 …個人"));
        list.add(new Word("…だい …台 （用於計算機械、車輛等機械類時）"));
        list.add(new Word("…まい …枚 （用於計算紙張、郵票等薄的物品時"));
        list.add(new Word("…かい …回 …次"));
        list.add(new Word("りんご 蘋果"));
        list.add(new Word("みかん 橘子"));
        list.add(new Word("サンドイッチ 三明治"));
        list.add(new Word("カレー［ライス］ 咖哩"));
        list.add(new Word("アイスクリーム 冰淇淋"));
        list.add(new Word("きって 切手 郵票"));
        list.add(new Word("はがき 明信片"));
        list.add(new Word("ふうとう 封筒 信封"));
        list.add(new Word("そくたつ 速達 限時信"));
        list.add(new Word("かきとめ 書留 掛號信"));
        list.add(new Word("ふなびん 船便 船運"));
        list.add(new Word("りょうしん 両親 雙親 "));
        list.add(new Word("きょうだい 兄弟 兄弟姊妹"));
        list.add(new Word("あに 兄 （我）哥哥"));
        list.add(new Word("おにいさん お兄さん （他人的）哥哥"));
        list.add(new Word("あね 姉 （我）姊姊"));
        list.add(new Word("おねえさん お姉さん （他人的）姊姊 "));
        list.add(new Word("おとうと 弟 （我）弟弟 "));
        list.add(new Word("おとうとさん 弟さん （他人的）弟弟"));
        list.add(new Word("いもうと 妹 （我）妹妹"));
        list.add(new Word("いもうとさん 妹さん （他人的）妹妹 "));
        list.add(new Word("がいこく 外国 外國"));
        list.add(new Word("…じかん …時間 …小時"));
        list.add(new Word("…しゅうかん …週間 …星期"));
        list.add(new Word("…かげつ …か月 …個月"));
        list.add(new Word("…ねん …年 …年"));
        list.add(new Word("～ぐらい ～左右"));
        list.add(new Word("どのぐらい 多久"));
        list.add(new Word("ぜんぶで 全部で 一共"));
        list.add(new Word("みんな 全部，全體"));
        list.add(new Word("～だけ 只，仅仅"));
        list.add(new Word("いらっしゃいませ。 歡迎光臨"));

        return list;
    }
//    public static ArrayList<Word> getTwelfthWords(){
//        ArrayList<Word> list = new ArrayList<>();
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//        list.add(new Word(""));
//
//        return list;
//    }

}
