/*
 * Copyright 2019 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.iconics.typeface.library.huma

import com.mikepenz.iconics.typeface.IIcon
import com.mikepenz.iconics.typeface.ITypeface
import java.util.LinkedList

@Suppress("EnumEntryName")
object Huma : ITypeface {

    override val fontRes: Int
        get() = R.font.huma_font_v3_0

    override val characters: Map<String, Char> by lazy {
        Icon.values().associate { it.name to it.character }
    }
    
    override val mappingPrefix: String
        get() = "hum"

    override val fontName: String
        get() = "Huma"

    override val version: String
        get() = "3.0"

    override val iconCount: Int
        get() = characters.size

    override val icons: List<String>
        get() = characters.keys.toCollection(LinkedList())

    override val author: String
        get() = "mehran"

    override val url: String
        get() = ""

    override val description: String
        get() = ""

    override val license: String
        get() = ""

    override val licenseUrl: String
        get() = ""

    override fun getIcon(key: String): IIcon = Icon.valueOf(key)

    enum class Icon constructor(override val character: Char) : IIcon {
        hum_add('\ue97f'),
		hum_asanPardakht('\ue900'),
		hum_bookmark('\ue902'),
		hum_bookmark_fill('\ue901'),
		hum_bullet('\ue904'),
		hum_bullet_fill('\ue903'),
		hum_calender('\ue906'),
		hum_calender_fill('\ue905'),
		hum_card('\ue908'),
		hum_card_fill('\ue907'),
		hum_cart('\ue90a'),
		hum_cart_fill('\ue909'),
		hum_check('\ue90b'),
		hum_checkbox('\ue90d'),
		hum_checkbox_fill('\ue90c'),
		hum_circle_add('\ue90f'),
		hum_circle_add_fill('\ue90e'),
		hum_circle_check('\ue911'),
		hum_circle_check_fill('\ue910'),
		hum_circle_close('\ue913'),
		hum_circle_close_fill('\ue912'),
		hum_circle_info('\ue915'),
		hum_circle_info_fill('\ue914'),
		hum_circle_minuse('\ue917'),
		hum_circle_minuse_fill('\ue916'),
		hum_close('\ue918'),
		hum_control('\ue91a'),
		hum_control_fill('\ue919'),
		hum_dashboard('\ue91c'),
		hum_dashboard_fill('\ue91b'),
		hum_delete('\ue91e'),
		hum_delete_fill('\ue91d'),
		hum_document('\ue920'),
		hum_document_fill('\ue91f'),
		hum_downarrow('\ue921'),
		hum_download('\ue922'),
		hum_drag('\ue923'),
		hum_easy('\ue924'),
		hum_edit('\ue926'),
		hum_edit_fill('\ue925'),
		hum_email('\ue928'),
		hum_email_fill('\ue927'),
		hum_exit('\ue929'),
		hum_expiration('\ue92b'),
		hum_expiration_fill('\ue92a'),
		hum_filter('\ue92d'),
		hum_filter_fill('\ue92c'),
		hum_game('\ue92f'),
		hum_game_fill('\ue92e'),
		hum_googlePlay('\ue930'),
		hum_grouping('\ue932'),
		hum_grouping_fill('\ue931'),
		hum_hard('\ue933'),
		hum_hide('\ue935'),
		hum_hide_fill('\ue934'),
		hum_home('\ue937'),
		hum_home_fill('\ue936'),
		hum_huma('\ue938'),
		hum_language('\ue93a'),
		hum_language_fill('\ue939'),
		hum_left('\ue93b'),
		hum_leftarrow('\ue93c'),
		hum_like('\ue93e'),
		hum_like_fill('\ue93d'),
		hum_link('\ue93f'),
		hum_list('\ue941'),
		hum_list_fill('\ue940'),
		hum_location('\ue943'),
		hum_location_fill('\ue942'),
		hum_login('\ue944'),
		hum_medium('\ue945'),
		hum_menu('\ue946'),
		hum_more('\ue948'),
		hum_more_horizontal('\ue947'),
		hum_music('\ue949'),
		hum_password('\ue94b'),
		hum_password_fill('\ue94a'),
		hum_pause('\ue94d'),
		hum_pause_fill('\ue94c'),
		hum_phone('\ue94f'),
		hum_phone_fill('\ue94e'),
		hum_picture('\ue951'),
		hum_picture_fill('\ue950'),
		hum_play('\ue953'),
		hum_play_fill('\ue952'),
		hum_priority('\ue954'),
		hum_profile('\ue956'),
		hum_profile_fill('\ue955'),
		hum_promotion('\ue958'),
		hum_promotion_fill('\ue957'),
		hum_right('\ue959'),
		hum_rightarrow('\ue95a'),
		hum_search('\ue95c'),
		hum_search_fill('\ue95b'),
		hum_send('\ue95d'),
		hum_setting('\ue95f'),
		hum_setting_fill('\ue95e'),
		hum_show('\ue961'),
		hum_show_fill('\ue960'),
		hum_skip('\ue962'),
		hum_sort('\ue963'),
		hum_source('\ue965'),
		hum_source_fill('\ue964'),
		hum_star('\ue967'),
		hum_star_fill('\ue966'),
		hum_tag('\ue969'),
		hum_tag_fill('\ue968'),
		hum_time('\ue96b'),
		hum_time_fill('\ue96a'),
		hum_title('\ue96d'),
		hum_title_fill('\ue96c'),
		hum_tv('\ue96f'),
		hum_tv_fill('\ue96e'),
		hum_uparrow('\ue970'),
		hum_update('\ue971'),
		hum_upload('\ue972'),
		hum_users('\ue974'),
		hum_users_fill('\ue973'),
		hum_version('\ue976'),
		hum_version_fill('\ue975'),
		hum_video('\ue978'),
		hum_video_fill('\ue977'),
		hum_voice('\ue97a'),
		hum_voice_fill('\ue979'),
		hum_warning('\ue97c'),
		hum_warning_fill('\ue97b'),
		hum_web('\ue97d'),
		hum_wifi('\ue97e');

        override val typeface: ITypeface by lazy { Huma }
    }
}