# coding: utf-8

"""
    Bybit API

    ## REST API for the Bybit Exchange.   # noqa: E501

    OpenAPI spec version: 1.0.0
    Contact: support@bybit.com
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class RiskIDRes(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'id': 'float',
        'coin': 'str',
        'limit': 'float',
        'maintain_margin': 'str',
        'starting_margin': 'str',
        'section': 'str',
        'is_lowest_risk': 'float',
        'created_at': 'str',
        'updated_at': 'str'
    }

    attribute_map = {
        'id': 'id',
        'coin': 'coin',
        'limit': 'limit',
        'maintain_margin': 'maintain_margin',
        'starting_margin': 'starting_margin',
        'section': 'section',
        'is_lowest_risk': 'is_lowest_risk',
        'created_at': 'created_at',
        'updated_at': 'updated_at'
    }

    def __init__(self, id=None, coin=None, limit=None, maintain_margin=None, starting_margin=None, section=None, is_lowest_risk=None, created_at=None, updated_at=None):  # noqa: E501
        """RiskIDRes - a model defined in Swagger"""  # noqa: E501

        self._id = None
        self._coin = None
        self._limit = None
        self._maintain_margin = None
        self._starting_margin = None
        self._section = None
        self._is_lowest_risk = None
        self._created_at = None
        self._updated_at = None
        self.discriminator = None

        if id is not None:
            self.id = id
        if coin is not None:
            self.coin = coin
        if limit is not None:
            self.limit = limit
        if maintain_margin is not None:
            self.maintain_margin = maintain_margin
        if starting_margin is not None:
            self.starting_margin = starting_margin
        if section is not None:
            self.section = section
        if is_lowest_risk is not None:
            self.is_lowest_risk = is_lowest_risk
        if created_at is not None:
            self.created_at = created_at
        if updated_at is not None:
            self.updated_at = updated_at

    @property
    def id(self):
        """Gets the id of this RiskIDRes.  # noqa: E501


        :return: The id of this RiskIDRes.  # noqa: E501
        :rtype: float
        """
        return self._id

    @id.setter
    def id(self, id):
        """Sets the id of this RiskIDRes.


        :param id: The id of this RiskIDRes.  # noqa: E501
        :type: float
        """

        self._id = id

    @property
    def coin(self):
        """Gets the coin of this RiskIDRes.  # noqa: E501


        :return: The coin of this RiskIDRes.  # noqa: E501
        :rtype: str
        """
        return self._coin

    @coin.setter
    def coin(self, coin):
        """Sets the coin of this RiskIDRes.


        :param coin: The coin of this RiskIDRes.  # noqa: E501
        :type: str
        """

        self._coin = coin

    @property
    def limit(self):
        """Gets the limit of this RiskIDRes.  # noqa: E501


        :return: The limit of this RiskIDRes.  # noqa: E501
        :rtype: float
        """
        return self._limit

    @limit.setter
    def limit(self, limit):
        """Sets the limit of this RiskIDRes.


        :param limit: The limit of this RiskIDRes.  # noqa: E501
        :type: float
        """

        self._limit = limit

    @property
    def maintain_margin(self):
        """Gets the maintain_margin of this RiskIDRes.  # noqa: E501


        :return: The maintain_margin of this RiskIDRes.  # noqa: E501
        :rtype: str
        """
        return self._maintain_margin

    @maintain_margin.setter
    def maintain_margin(self, maintain_margin):
        """Sets the maintain_margin of this RiskIDRes.


        :param maintain_margin: The maintain_margin of this RiskIDRes.  # noqa: E501
        :type: str
        """

        self._maintain_margin = maintain_margin

    @property
    def starting_margin(self):
        """Gets the starting_margin of this RiskIDRes.  # noqa: E501


        :return: The starting_margin of this RiskIDRes.  # noqa: E501
        :rtype: str
        """
        return self._starting_margin

    @starting_margin.setter
    def starting_margin(self, starting_margin):
        """Sets the starting_margin of this RiskIDRes.


        :param starting_margin: The starting_margin of this RiskIDRes.  # noqa: E501
        :type: str
        """

        self._starting_margin = starting_margin

    @property
    def section(self):
        """Gets the section of this RiskIDRes.  # noqa: E501


        :return: The section of this RiskIDRes.  # noqa: E501
        :rtype: str
        """
        return self._section

    @section.setter
    def section(self, section):
        """Sets the section of this RiskIDRes.


        :param section: The section of this RiskIDRes.  # noqa: E501
        :type: str
        """

        self._section = section

    @property
    def is_lowest_risk(self):
        """Gets the is_lowest_risk of this RiskIDRes.  # noqa: E501


        :return: The is_lowest_risk of this RiskIDRes.  # noqa: E501
        :rtype: float
        """
        return self._is_lowest_risk

    @is_lowest_risk.setter
    def is_lowest_risk(self, is_lowest_risk):
        """Sets the is_lowest_risk of this RiskIDRes.


        :param is_lowest_risk: The is_lowest_risk of this RiskIDRes.  # noqa: E501
        :type: float
        """

        self._is_lowest_risk = is_lowest_risk

    @property
    def created_at(self):
        """Gets the created_at of this RiskIDRes.  # noqa: E501


        :return: The created_at of this RiskIDRes.  # noqa: E501
        :rtype: str
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at):
        """Sets the created_at of this RiskIDRes.


        :param created_at: The created_at of this RiskIDRes.  # noqa: E501
        :type: str
        """

        self._created_at = created_at

    @property
    def updated_at(self):
        """Gets the updated_at of this RiskIDRes.  # noqa: E501


        :return: The updated_at of this RiskIDRes.  # noqa: E501
        :rtype: str
        """
        return self._updated_at

    @updated_at.setter
    def updated_at(self, updated_at):
        """Sets the updated_at of this RiskIDRes.


        :param updated_at: The updated_at of this RiskIDRes.  # noqa: E501
        :type: str
        """

        self._updated_at = updated_at

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value
        if issubclass(RiskIDRes, dict):
            for key, value in self.items():
                result[key] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, RiskIDRes):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
