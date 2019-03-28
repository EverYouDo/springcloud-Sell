package com.guier.service.impl;


import com.guier.dto.OrderDTO;
import com.guier.repository.OrderDetailRepository;
import com.guier.repository.OrderMasterRepository;
import com.guier.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(String orderId) {
        return null;
    }

//    @Autowired
//    private ProductClient productClient;
//
//    @Override
//    @Transactional
//    public OrderDTO create(OrderDTO orderDTO) {
//        String orderId = KeyUtil.genUniqueKey();
//
//       //查询商品信息(调用商品服务)
//        List<String> productIdList = orderDTO.getOrderDetailList().stream()
//                .map(OrderDetail::getProductId)
//                .collect(Collectors.toList());
//        List<ProductInfoOutput> productInfoList = productClient.listForOrder(productIdList);
//
//       //计算总价
//        BigDecimal orderAmout = new BigDecimal(BigInteger.ZERO);
//        for (OrderDetail orderDetail: orderDTO.getOrderDetailList()) {
//            for (ProductInfoOutput productInfo: productInfoList) {
//                if (productInfo.getProductId().equals(orderDetail.getProductId())) {
//                    //单价*数量
//                    orderAmout = productInfo.getProductPrice()
//                            .multiply(new BigDecimal(orderDetail.getProductQuantity()))
//                            .add(orderAmout);
//                    BeanUtils.copyProperties(productInfo, orderDetail);
//                    orderDetail.setOrderId(orderId);
//                    orderDetail.setDetailId(KeyUtil.genUniqueKey());
//                    //订单详情入库
//                    orderDetailRepository.save(orderDetail);
//                }
//            }
//        }
//
//       //扣库存(调用商品服务)
//        List<DecreaseStockInput> decreaseStockInputList = orderDTO.getOrderDetailList().stream()
//                .map(e -> new DecreaseStockInput(e.getProductId(), e.getProductQuantity()))
//                .collect(Collectors.toList());
//        productClient.decreaseStock(decreaseStockInputList);
//
//        //订单入库
//        OrderMaster orderMaster = new OrderMaster();
//        orderDTO.setOrderId(orderId);
//        BeanUtils.copyProperties(orderDTO, orderMaster);
//        orderMaster.setOrderAmount(orderAmout);
//        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
//        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());
//        orderMasterRepository.save(orderMaster);
//        return orderDTO;
//    }
//
//    @Override
//    @Transactional
//    public OrderDTO finish(String orderId) {
//        //1. 先查询订单
//        Optional<OrderMaster> orderMasterOptional = orderMasterRepository.findById(orderId);
//        if (!orderMasterOptional.isPresent()) {
//            throw new OrderException(ResultEnum.ORDER_NOT_EXIST);
//        }
//
//        //2. 判断订单状态
//        OrderMaster orderMaster = orderMasterOptional.get();
//        if (OrderStatusEnum.NEW.getCode() != orderMaster.getOrderStatus()) {
//            throw new OrderException(ResultEnum.ORDER_STATUS_ERROR);
//        }
//
//        //3. 修改订单状态为完结
//        orderMaster.setOrderStatus(OrderStatusEnum.FINISHED.getCode());
//        orderMasterRepository.save(orderMaster);
//
//        //查询订单详情
//        List<OrderDetail> orderDetailList = orderDetailRepository.findByOrderId(orderId);
//        if (CollectionUtils.isEmpty(orderDetailList)) {
//            throw new OrderException(ResultEnum.ORDER_DETAIL_NOT_EXIST);
//        }
//
//        OrderDTO orderDTO = new OrderDTO();
//        BeanUtils.copyProperties(orderMaster, orderDTO);
//        orderDTO.setOrderDetailList(orderDetailList);
//
//        return orderDTO;
//    }


}
