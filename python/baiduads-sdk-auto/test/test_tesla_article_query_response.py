"""
    dev2 api schema

    'dev2.baidu.com' api schema  # noqa: E501

Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import baiduads
from baiduads.materialarticle.model.article_ext_dto import ArticleExtDto
from baiduads.materialarticle.model.article_image import ArticleImage
from baiduads.materialarticle.model.bind_material_dto import BindMaterialDto
globals()['ArticleExtDto'] = ArticleExtDto
globals()['ArticleImage'] = ArticleImage
globals()['BindMaterialDto'] = BindMaterialDto
from baiduads.materialarticle.model.tesla_article_query_response import TeslaArticleQueryResponse


class TestTeslaArticleQueryResponse(unittest.TestCase):
    """TeslaArticleQueryResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testTeslaArticleQueryResponse(self):
        """Test TeslaArticleQueryResponse"""
        # FIXME: construct object with mandatory attributes with example values
        # model = TeslaArticleQueryResponse()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
