#!/usr/bin/env python
# -*- coding: utf-8 -*-
"""
Copyright (c) 2022 Baidu.com, Inc. All Rights Reserved
"""

from baiduads_manual.oauth.model.sub_user_info import SubUserInfo


class UserInfo:
    """user info data model

    Attributes:
        masterUid: 同意授权用户ucid
        masterName: 同意授权用户对应的ucname
        subUserList: 同意授权用户关联的子账号列表
    """
    def __init__(self, masterUid, masterName, subUserList):
        self.masterUid = masterUid
        self.masterName = masterName
        self.subUserList = subUserList

    @classmethod
    def dict_to_obj(cls, dict_data):
        """用于将dict转换为对象
        """
        sub_user_list = None
        if "subUserList" in dict_data:
            sub_user_list = []
            for d in dict_data["subUserList"]:
                sub_user_list.append(SubUserInfo.dict_to_obj(d))

        return UserInfo(
            dict_data.get("masterUid", None),
            dict_data.get("masterName", None),
            sub_user_list
        )
