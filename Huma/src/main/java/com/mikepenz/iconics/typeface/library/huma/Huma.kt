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
        get() = R.font.huma_font_v1_5

    override val characters: Map<String, Char> by lazy {
        Icon.values().associate { it.name to it.character }
    }
    
    override val mappingPrefix: String
        get() = "hum"

    override val fontName: String
        get() = "Huma"

    override val version: String
        get() = "1.5"

    override val iconCount: Int
        get() = characters.size

    override val icons: List<String>
        get() = characters.keys.toCollection(LinkedList())

    override val author: String
        get() = "Huma"

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
        hum_asanpardakht('\ue800'),
		hum_asset_572('\ue801'),
		hum_asset_616('\ue802'),
		hum_bookmark('\ue803'),
		hum_bookmark_fill('\ue804'),
		hum_bullet('\ue805'),
		hum_bullet_fill('\ue806'),
		hum_calender('\ue807'),
		hum_calender_fill('\ue808'),
		hum_card('\ue809'),
		hum_card_fill('\ue80a'),
		hum_cart('\ue80b'),
		hum_cart_fill('\ue80c'),
		hum_checklist('\ue80d'),
		hum_checklist_fill('\ue80e'),
		hum_close('\ue80f'),
		hum_close_fill('\ue810'),
		hum_color('\ue811'),
		hum_color_fill('\ue812'),
		hum_control('\ue813'),
		hum_controlfill('\ue814'),
		hum_dashboard('\ue815'),
		hum_dashboard_fill('\ue816'),
		hum_delete('\ue817'),
		hum_delete_fill('\ue818'),
		hum_developer('\ue819'),
		hum_developer_fill('\ue81a'),
		hum_document('\ue81b'),
		hum_document_fill('\ue81c'),
		hum_downarrow('\ue81d'),
		hum_download('\ue81e'),
		hum_download_fill('\ue81f'),
		hum_drag('\ue820'),
		hum_easy('\ue821'),
		hum_edit('\ue822'),
		hum_edit_fill('\ue823'),
		hum_email('\ue825'),
		hum_email_('\ue824'),
		hum_email_fill('\ue826'),
		hum_emailfill('\ue827'),
		hum_exit('\ue828'),
		hum_exit_fill('\ue829'),
		hum_expiration('\ue82a'),
		hum_expiration_fill('\ue82b'),
		hum_filter('\ue82c'),
		hum_filter_fill('\ue82d'),
		hum_fitness('\ue82e'),
		hum_fitness_fill('\ue82f'),
		hum_game('\ue830'),
		hum_game_fill('\ue831'),
		hum_googleplay('\ue832'),
		hum_grouping('\ue833'),
		hum_grouping_fill('\ue834'),
		hum_hard('\ue835'),
		hum_hi('\ue836'),
		hum_hide('\ue837'),
		hum_hide_fill('\ue838'),
		hum_home('\ue839'),
		hum_home_fill('\ue83a'),
		hum_huma('\ue83b'),
		hum_info('\ue83c'),
		hum_info2('\ue83e'),
		hum_info2_fill('\ue83f'),
		hum_info_fill('\ue83d'),
		hum_language('\ue840'),
		hum_language_fill('\ue841'),
		hum_left('\ue842'),
		hum_leftarrow('\ue843'),
		hum_like('\ue844'),
		hum_like_fill('\ue845'),
		hum_link('\ue846'),
		hum_list('\ue847'),
		hum_list_fill('\ue848'),
		hum_location('\ue849'),
		hum_location_fill('\ue84a'),
		hum_lockedwifi('\ue84b'),
		hum_login('\ue84c'),
		hum_loginfill('\ue84d'),
		hum_medium('\ue84e'),
		hum_minuse('\ue84f'),
		hum_minuse_fill('\ue850'),
		hum_music('\ue851'),
		hum_music_fill('\ue852'),
		hum_notv('\ue853'),
		hum_password('\ue854'),
		hum_password_fill('\ue855'),
		hum_pause('\ue856'),
		hum_pause_fill('\ue857'),
		hum_phone('\ue858'),
		hum_phone_fill('\ue859'),
		hum_picture('\ue85a'),
		hum_picture_fill('\ue85b'),
		hum_play('\ue85c'),
		hum_play_fill('\ue85d'),
		hum_plus('\ue85e'),
		hum_plus_fill('\ue85f'),
		hum_price('\ue860'),
		hum_price_fill('\ue861'),
		hum_priority('\ue862'),
		hum_profile('\ue863'),
		hum_profile_fill('\ue864'),
		hum_promotion('\ue865'),
		hum_promotion_fill('\ue866'),
		hum_rightarrow('\ue867'),
		hum_search('\ue868'),
		hum_search_fill('\ue869'),
		hum_send('\ue86a'),
		hum_setting('\ue86b'),
		hum_setting_fill('\ue86c'),
		hum_show('\ue86d'),
		hum_show_fill('\ue86e'),
		hum_skip('\ue86f'),
		hum_sort('\ue870'),
		hum_sort_fill('\ue871'),
		hum_source('\ue872'),
		hum_sourcefill('\ue873'),
		hum_star('\ue874'),
		hum_star_fill('\ue875'),
		hum_tag('\ue876'),
		hum_tag_fill('\ue877'),
		hum_time('\ue878'),
		hum_time_fill('\ue879'),
		hum_title('\ue87a'),
		hum_title_fill('\ue87b'),
		hum_tv('\ue87c'),
		hum_uparrow('\ue87d'),
		hum_update('\ue87e'),
		hum_upload('\ue87f'),
		hum_upload_fill('\ue880'),
		hum_users('\ue881'),
		hum_users_fill('\ue882'),
		hum_version('\ue883'),
		hum_version_fill('\ue884'),
		hum_video('\ue885'),
		hum_video_fill('\ue886'),
		hum_voice('\ue887'),
		hum_voice_fill('\ue888'),
		hum_warning('\ue889'),
		hum_warning_fill('\ue88a'),
		hum_web('\ue88b'),
		hum_web_fill('\ue88c'),
		hum_wifi('\ue88d');

        override val typeface: ITypeface by lazy { Huma }
    }
}